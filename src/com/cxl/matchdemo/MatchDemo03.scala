package com.cxl.matchdemo

import scala.io.StdIn

object MatchDemo03 {

  def main(args: Array[String]): Unit = {
    val in = StdIn.readLine()

    in match {
      case "1" => println("一")
      case "2" => println("二")
      case "3" => println("三")
      case "4" => println("四")
      case _ => println("其他内容")
    }


  }

}
