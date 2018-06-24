package com.rewera.parallaelism

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Random, Success}

object Application extends App {
  println("Computation started...")

  val f = Future {
    Thread.sleep(Random.nextInt(500))
    41
  }

  println("Before onComplete...")
  f.onComplete {
    case Success(value) => println(s"Received result: $value")
    case Failure(e) => e.printStackTrace()
  }

  println("A..."); Thread.sleep(100)
  println("B..."); Thread.sleep(100)
  println("C..."); Thread.sleep(100)
  println("D..."); Thread.sleep(100)
  println("E..."); Thread.sleep(100)
  println("F..."); Thread.sleep(100)
  Thread.sleep(2000)


}
