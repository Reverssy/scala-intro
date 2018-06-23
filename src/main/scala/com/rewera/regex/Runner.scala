package com.rewera.regex

import scala.io.StdIn

object Runner extends App {
  println("Enter password: ")
  val password =  StdIn.readLine()

  if (PasswordValidator.validate(password)) {
    println("Password saved")
  } else {
    println("Password invalid. try again.")
  }


}
