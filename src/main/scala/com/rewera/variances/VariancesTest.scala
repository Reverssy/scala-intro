package com.rewera.variances

object VariancesTest extends App {
  trait Node[+B] {
    // prepend function accepts any supertype of type B
    def prepend[U >: B](elem: U): Node[U]
  }

  case class ListNode[+B](value: B, next: Node[B]) extends Node[B] {
    override def prepend[U >: B](elem: U): Node[U] = ListNode(elem, this)
    def head: B = value
    def tail: Node[B] = next
  }

  case class Nil[+B]() extends Node[B] {
    override def prepend[U >: B](elem: U): Node[U] = ListNode(elem, this)
  }

}
