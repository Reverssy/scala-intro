package com.rewera.flatmaps

object FlatMapTest extends App {
  val list = List(1,2,3,4,5)

  def func(x: Int) = List(x-1, x, x+1)
  println(list.map(i => func(i)))
  println(list.map(func))
  println(list.flatMap(e => func(e)))

  def toOption(x: Int) = if (x > 2) Some(x) else None
  println(list.map(toOption))
  println(list.flatMap(e => toOption(e)))

  val map = Map(1->2, 2->4, 3->9)
  def toOption(k: Int, v: Int) = if (v > 2) Some(k->v) else None
  println(map.flatMap( e => toOption(e._1, e._2) ))
  println(map.flatMap( { case (k, v) => toOption(k, v) } ))

  println(map.filter({ case (k, v) => toOption(v).isDefined }))

}
