package com.rewera.basics.mixins

object Runner extends App {
  class RichStringIterator extends StringIterator("Scala") with RichIterator
  val richStringIterator = new RichStringIterator
  richStringIterator.forEach(ch => println(ch.toUpper))
}
