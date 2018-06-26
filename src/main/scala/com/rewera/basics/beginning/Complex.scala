package com.rewera.basics.beginning

case class Complex(real: Double = 0, imaginary: Double = 0) {
  def +(other: Complex): Complex = {
    val realResult = real + other.real
    val imaginaryResult = imaginary + other.imaginary
    Complex(realResult, imaginaryResult)
  }

  override def toString: String = real + ( if(imaginary < 0) "" else "+") + imaginary + "i"
}
