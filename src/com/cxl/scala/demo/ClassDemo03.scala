package com.cxl.scala.demo

object ClassDemo03 {

  class Person{
    var name:String = ""
    var age:Int = 0
  }

  def main(args: Array[String]): Unit = {
    val p = new Person
    p.name = "zhangsan"
    p.age = 20

    println(p.name)
    println(p.age)
  }
}
