package com.rewera.parallaelism.contextslearning

import java.time.Instant
import java.time.format.DateTimeFormatter

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}

object Prog {
  def debug(msg: String): Unit = {
    val now = DateTimeFormatter.ISO_INSTANT.format(Instant.now()).substring(11, 23)
    val thread = Thread.currentThread().getName()
    println(s"$now [$thread] $msg")
  }

  def taskA(): Future[Unit] = Future {
    debug("Starting taskA")
    Thread.sleep(1000)
    debug("Finished taskA")
  }

  def taskB(): Future[Unit] = Future {
    debug("Starting taskB")
    Thread.sleep(2000)
    debug("Finished taskB")
  }

  def main(args: Array[String]): Unit = {
    debug("Starting Main")
    val futureA = taskA()
    val futureB = taskB()
    debug("Continuing Main")

    Await.result(futureA zip futureB, Duration.Inf)
  }

}
