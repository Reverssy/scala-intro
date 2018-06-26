package com.rewera.basics.higherorderfunctions

object HOF extends App {

  val salaries: List[Double] = List(20000, 40000, 120000)

  // Please avoid using vars
  var newSalaries = SalaryRaiser.smallPromotion(salaries)
  newSalaries.foreach(println)
  newSalaries = SalaryRaiser.greatPromotion(salaries)
  newSalaries.foreach(println)
  newSalaries = SalaryRaiser.hugePromotion(salaries)
  newSalaries.foreach(println)

  def doubleFunc = SalaryRaiser.getDoublePromotionFunc()

  println(doubleFunc(15))
}
