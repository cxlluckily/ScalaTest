package com.cxl.scala.demo

object ClassDemo07 {

  class Person(var name:String = "",var age:Int = 0){

    println("调用主构造器")
    var address:String = _

    def this(name:String,age:Int,address:String){
      this(name,age)
      println("辅助构造")
      this.address = address

    }

    def say() = println(s"${name} ${age} ${address}")


  }

  def main(args: Array[String]): Unit = {
    val person = new Person("zhangsan",20)
    println(person.name)
    println(person.age)


    println("----")

    val empty = new Person
    println(empty.name)
    println(empty.age)

    println("------")

    val p2 = new Person(age = 30)
    println(p2.name)
    println(p2.age)


    println("--------------")

    val p3 = new Person("王五",18,"北京")
    p3.say()

  }

}
