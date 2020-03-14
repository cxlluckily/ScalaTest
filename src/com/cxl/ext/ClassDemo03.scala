package com.cxl.ext

object ClassDemo03 {

  class Person{
    val name = "super"

    def getName = name


  }


  class Student extends Person{

    override val name: String = "child"

    override def getName: String = s"hello,"+super.getName

  }

  def main(args: Array[String]): Unit = {
    val student = new Student
    println(student.name)
    println(student.getName)


  }
}
