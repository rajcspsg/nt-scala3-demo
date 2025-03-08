package math

import math.MathUtils.quadruple

object MathUtils:
  def double(i: Int) = i * 2

  def triple(i: Int) = double(i) + i

  def quadruple(i: Int) = double(i) + double(i)

object MathApp extends App:
  val a = quadruple(4)
  val b: Boolean = true
  println(s"value of a is $a")
