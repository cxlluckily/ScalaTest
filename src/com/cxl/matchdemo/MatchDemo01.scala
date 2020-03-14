package com.cxl.matchdemo

object MatchDemo01 {


  def main(args: Array[String]): Unit = {
    val list = List(1,2,3)

    list match {
      case x::y::Nil => println(s"${x} ${y}")
      case 0::tail => println("0....")
      case 0::Nil => println("only 0")
      case _::x::y::Nil => println(s"${list(0)} ${x} ${y}")
      case _ => println("未匹配")
    }

  }

}
