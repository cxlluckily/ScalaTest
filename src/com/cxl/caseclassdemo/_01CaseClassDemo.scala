package com.cxl.caseclassdemo

object _01CaseClassDemo {

  class Person(val name:String,val age:Int){
      println("Person主构造")
  }

  class Student(override val name:String, override val age:Int) extends Person(name,age){
      println("Student主构造")
  }


  def main(args: Array[String]): Unit = {
    val p = new Person("张三",28)
    println(p)


    val s = new Student("李四",21)
    println(s)

  }

}
