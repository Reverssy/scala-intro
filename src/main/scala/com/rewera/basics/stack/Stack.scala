package com.rewera.basics.stack

class Stack[A] {
  //Don't use vars
  private var elements: List[A] = Nil

  def push(newElement: A): Unit =
    elements = newElement :: elements

  def peek(): A = elements.head

  def pop(): A = {
    val currentTop = peek()
    elements = elements.tail
    currentTop
  }
}
