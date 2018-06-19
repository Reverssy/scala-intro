package com.rewera

class Complex {
  private var real: Double = 0
  private var imaginary: Double = 0

  def re: Double = real
  def im: Double = imaginary

  def re_= (newValue: Double): Unit = {
    real = newValue
  }
  def im_= (newValue: Double): Unit = {
    imaginary = newValue
  }


  def +(other: Complex): Complex = {
    val real = this.re + other.re
    val imaginary = this.im + other.im
    val result = new Complex()
    result.re = real
    result.im = imaginary
    result
  }

  override
  def toString: String = {
    re + ( if(im < 0) "" else "+") + im + "i"
  }
}
