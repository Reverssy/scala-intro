package com.rewera.stack

object StackTest extends App {
  trait Fruit
  class Apple extends Fruit
  class Banana extends Fruit

  val stack = new Stack[Fruit]
  stack.push(new Apple)
  stack.push(new Banana)

  println(stack.peek())
  println(stack.pop())
  println(stack.pop())
  println(stack.pop())

}
