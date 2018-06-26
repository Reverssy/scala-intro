package com.rewera.basics.mixins

trait RichIterator extends AbsIterator {
  def forEach(func: T => Unit): Unit =
    while (hasNext)
      func(next)
}
