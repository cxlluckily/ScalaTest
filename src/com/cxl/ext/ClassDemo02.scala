package com.cxl.ext

object ClassDemo02 {

  class Person{
    var name = "super"

    def getName = this.name

  }

  object Student extends Person


  def main(args: Array[String]): Unit = {
    println(Student.getName)

  }

}
