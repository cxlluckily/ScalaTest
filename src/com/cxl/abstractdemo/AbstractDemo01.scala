package com.cxl.abstractdemo

object AbstractDemo01 {

  abstract class Shape{
    def area:Double
  }

  class Square(var edge:Double) extends Shape{
    override def area: Double = edge * edge
  }

  class Rectangle(var length:Double,var width:Double) extends Shape {
    override def area: Double = length * width
  }

  class Cirle(var radius:Double) extends Shape{
    override def area: Double = Math.PI * radius * radius
  }


  def main(args: Array[String]): Unit = {
    val square = new Square(3)
    val rectangle = new Rectangle(12,4)
    val cirle = new Cirle(3.1)

    println(square.area)
    println(rectangle.area)
    println(cirle.area)

  }



}
