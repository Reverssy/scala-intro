package com.rewera.basics.regex

import scala.io.StdIn

//Use def main instead of App
object Runner extends App {
  println("Enter password: ")
  val password =  StdIn.readLine()

  if (PasswordValidator.validate(password)) println("Password saved")
  else println("Password invalid. try again.")
}
