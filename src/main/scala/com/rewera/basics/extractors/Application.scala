package com.rewera.basics.extractors

import scala.io.StdIn

object Application extends App {
  println("Enter password: ")
  val password = StdIn.readLine()

  password match {
    case PasswordValidator(response) => println(response)
    case _ => println("Try again")
  }

}
