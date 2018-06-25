package com.rewera.parallaelism

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Futures2 extends App {
  val baseTime = System.currentTimeMillis()

  def longRunningComputation(i: Int): Future[Int] = Future {
    Thread.sleep(100)
    i + 1
  }
  longRunningComputation(11).onComplete({
    case Success(result) => println(s"result = $result")
    case Failure(e) => e.printStackTrace()
  })

  Thread.sleep(1000)


}
