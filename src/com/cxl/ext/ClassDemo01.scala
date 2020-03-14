package com.cxl.ext

object ClassDemo01 {

  class Person{
    var name = "super"

    def getName = this.name


  }

  class Student extends Person


  def main(args: Array[String]): Unit = {
    val p1 = new Person
    val p2 = new Student

    p2.name = "王五"

    println(p2.getName)


  }


}
