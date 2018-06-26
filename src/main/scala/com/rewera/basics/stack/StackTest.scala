package com.rewera.basics.stack

trait Fruit
class Apple extends Fruit
class Banana extends Fruit

object StackTest extends App {
  val stack = new Stack[Fruit]
  stack.push(new Apple)
  stack.push(new Banana)

  println(stack.peek())
  println(stack.pop())
  println(stack.pop())
  println(stack.pop())

}
