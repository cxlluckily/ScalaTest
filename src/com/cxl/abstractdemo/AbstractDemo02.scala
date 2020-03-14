package com.cxl.abstractdemo

object AbstractDemo02 {

  abstract class Person{
    val WHO_AM_I:String
  }

  class Student extends Person{
    override val WHO_AM_I: String = "学生"

  }

  class Policeman extends Person{
    override val WHO_AM_I: String = "警察"
  }


  def main(args: Array[String]): Unit = {
    val student = new Student
    val policeman = new Policeman

    println(student.WHO_AM_I)
    println(policeman.WHO_AM_I)


  }

}
