package com.cxl.abstractdemo

object AbstractDemo03 {

  abstract class Person{
    def sayHello
  }

  def main(args: Array[String]): Unit = {
    val p1 = new Person {
      override def sayHello: Unit = println("这是一个匿名内部类调用")
    }

    p1.sayHello
  }


}
