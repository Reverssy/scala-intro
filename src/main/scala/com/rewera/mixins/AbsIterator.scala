package com.rewera.mixins

abstract class AbsIterator {
  type T
  def hasNext: Boolean
  def next: T
}
