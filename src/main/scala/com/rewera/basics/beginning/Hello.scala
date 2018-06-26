package com.rewera.basics.beginning

import java.text.DateFormat
import java.util.{Date, Locale}

object Hello {
  def main(args: Array[String]): Unit = {
    val now = new Date()
    val df = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE)
    println(df format now)


    val c1 = Complex(90, 17)
    val c2 = Complex()
    println("c1 = " + c1)
    println("c2 = " + c2)
    println("c1 + c2 = " + (c1+c2))

  }
}
