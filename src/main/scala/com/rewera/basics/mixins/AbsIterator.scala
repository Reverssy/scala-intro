package com.rewera.basics.mixins

abstract class AbsIterator {
  type T
  def hasNext: Boolean
  def next: T
}
