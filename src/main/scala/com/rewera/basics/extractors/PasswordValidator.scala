package com.rewera.basics.extractors

import scala.util.matching.Regex

object PasswordValidator {
  val numberPattern: Regex = "[0-9]".r
  val upperCasePattern: Regex = "[A-Z]".r
  val specialCharacterPattern: Regex = "[^a-zA-Z0-9]".r

  def unapply(password: String): Option[String] = {
    val isNumber = numberPattern.findFirstMatchIn(password) match {
      case None =>
        println("Password must contain a number!")
        false
      case _ => true
    }

    val isUpperCase = upperCasePattern.findFirstMatchIn(password) match {
      case None =>
        println("Password must contain an upper case letter!")
        false
      case _ => true
    }

    val isSpecialCharacter = specialCharacterPattern.findFirstMatchIn(password) match {
      case None =>
        println("Password must contain a special character!")
        false
      case _ => true
    }

    if (isNumber && isUpperCase && isSpecialCharacter) Some("Password saved") else None
  }

}
