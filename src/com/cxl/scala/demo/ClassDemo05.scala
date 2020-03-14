package com.cxl.scala.demo

object ClassDemo05 {

  class Customer{
    var name:String = _
    var sex:String = _

    def sayHi(msg:String) = {
      println(msg)
    }

  }

  def main(args: Array[String]): Unit = {
    val customer = new Customer
    customer.name = "zhangsan"
    customer.sex = "男"
    customer.sayHi("你好")
  }

}
