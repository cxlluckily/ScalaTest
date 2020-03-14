package com.cxl.scala.demo

object ClassDemo04 {

    class Pserson{

      var name:String = _
      var age:Int = _

    }

  def main(args: Array[String]): Unit = {
    val p = new Pserson

    println(p.name)
    println(p.age)


  }
}
