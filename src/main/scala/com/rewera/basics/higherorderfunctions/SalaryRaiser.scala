package com.rewera.basics.higherorderfunctions

object SalaryRaiser {

  private def promotion(salaries: List[Double], promotionFunction: Double => Double): List[Double] =
    salaries.map(promotionFunction)

  def smallPromotion(salaries: List[Double]): List[Double] = {
    val smallPromo = 1.1
    promotion(salaries, salary => salary * smallPromo)
  }

  def greatPromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * math.log(salary))

  def hugePromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * salary)

  //noinspection AccessorLikeMethodIsEmptyParen
  def getDoublePromotionFunc(): Double => Double = {
    salary: Double => salary * 2
  }
}
