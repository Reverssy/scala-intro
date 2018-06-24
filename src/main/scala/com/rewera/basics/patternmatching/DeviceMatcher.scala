package com.rewera.basics.patternmatching

object DeviceMatcher {
  sealed abstract class Device
  case  class Phone(model: String) extends Device {
    def screenOff = "Turning screen off"
  }
  case class Computer(model: String) extends Device {
    def screenSaverOn = "Turning screen saver on"
  }

  def goIdle(device: Device): String = {
    device match {
      case p: Phone =>
        p.screenOff
      case c: Computer =>
        c.screenSaverOn
    }
  }


  def main(args: Array[String]): Unit = {
    println("START")
    val phone = Phone("iPhone 6s")
    val comp = Computer("MacBook Pro 2015")

    println(goIdle(phone))
    println(goIdle(comp))
  }

}
