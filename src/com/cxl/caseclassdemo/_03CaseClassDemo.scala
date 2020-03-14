package com.cxl.caseclassdemo

object _03CaseClassDemo {

  trait Sex

  case object Man extends Sex

  case object Woman extends Sex


  case class Person(id:Int,sex:Sex)


  def main(args: Array[String]): Unit = {

    val person = Person(1,Man)
    println(person)


  }

}
