package com.rewera.basics.stack

import scala.collection.mutable.ListBuffer

class Stack[A] {
  private val elements = new ListBuffer[A]()

  def push(newElement: A): Unit = {
    elements += newElement
  }

  def peek(): A = elements.last

  def pop(): A = {
    val currentTop = peek()
    elements -= currentTop
    currentTop
  }


}
