package com.rewera.beginning

object Timer {
  def oncePerSecond(callback: () => Unit): Unit = {
    while (true) {
      callback()
      Thread sleep 1000
    }
  }

  def timeFlies(): Unit = {
    println("Time flies like flies...")
  }

  def main(args: Array[String]): Unit = {
    oncePerSecond(() => println("Anonymous function!!!"))

  }

}
