package com.cxl.interview.test

object Test {

  var num = 0

  def main(args: Array[String]): Unit = {
    move(4,"x","y","z")
    println(num)
  }



  def move(n:Int,from:String,temp:String,to:String):Unit = {
    num += 1
    if(n == 1 ){
      println(s"${from}->${to}")
    }else{
      move(n-1,from,to,temp)

      println(s"${from}->${to}")

      move(n-1,temp,from,to)
    }
  }
}
