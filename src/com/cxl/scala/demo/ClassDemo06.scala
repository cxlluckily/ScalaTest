package com.cxl.scala.demo

object ClassDemo06 {

  class Person{

    private var name:String = _
    private var age:Int = _

    def getName() = name
    def setName(name:String) = this.name = name
    def getAge() = age
    def setAge(age:Int) = this.age = age

    private def getNameAndAge = {
      name -> age
    }
  }

  def main(args: Array[String]): Unit = {
    val p = new Person
    p.setName("zhangsan")
    p.setAge(10)

    println(p.getName())
    println(p.getAge())

  }

}
