package com.rewera.mixins

trait RichIterator extends AbsIterator {
  def forEach(func: T => Unit): Unit = {
    while (hasNext)
      func(next)
  }
}
