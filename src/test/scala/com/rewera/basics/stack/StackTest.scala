package com.rewera.basics.stack

import org.scalatest.{FlatSpec, Matchers}

class StackTest extends FlatSpec with Matchers {
  "A Stack" should "return values in last-in-first-out order" in {
      val stack = new Stack[Int]
      stack.push(1)
      stack.push(2)
      stack.push(3)
      stack.pop() shouldBe 3
      stack.pop() shouldEqual 2
      stack.pop() should equal (1)
    }
  it should "throw NoSuchElementException when called pop on an empty stack" in {
    val emptyStack = new Stack[Int]
    assertThrows[NoSuchElementException](emptyStack.pop())
  }
}
