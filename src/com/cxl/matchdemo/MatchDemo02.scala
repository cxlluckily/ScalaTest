package com.cxl.matchdemo

object MatchDemo02 {


  def main(args: Array[String]): Unit = {

    val list = Range(1,10).toList

//    val x1::l2 = list

//    val Array(_, x, y, z, l)= list

    val List(_, x, y, z, tail) = list

    println(x + " " +y+ " "+z)
//    println(l)

  }

}
