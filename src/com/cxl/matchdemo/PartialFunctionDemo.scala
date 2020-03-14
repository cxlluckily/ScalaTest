package com.cxl.matchdemo

object PartialFunctionDemo {

  def main(args: Array[String]): Unit = {

    val value:PartialFunction[Int,Any] = {
      case 1 => println("一")
      case 2 => println("二")
      case 3 => println("三")
      case _ => println("none")
    }

    value(1)
  }
}
