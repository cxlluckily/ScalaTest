package com.cxl.mixturedemo

import com.cxl.javademo.Person

object MixtureDemo {

  def main(args: Array[String]): Unit = {
    val p1 = new Person("张三",19)
    println(p1.name)
    println(p1.age)
    System.out.println(p1)

//    val i = Person.add(1,2)
//    println(i)
  }

}
