package com.rewera.basics.mixins

case class RichStringIterator() extends StringIterator("Scala") with RichIterator

object Runner extends App {
  val richStringIterator = RichStringIterator()
  richStringIterator.forEach(ch => println(ch.toUpper))
}
