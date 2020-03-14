package com.cxl.typedemo

object TypeDemo01 {

  class Person

  class Student extends Person {

    def study = {
       println("开始学习")
    }

  }

  def main(args: Array[String]): Unit = {
    val s1:Person = new Student

    if (s1.isInstanceOf[Student]){
      val s2 = s1.asInstanceOf[Student]
      s2.study
    }



  }

}
