package com.cxl.traitdemo

import java.text.SimpleDateFormat
import java.util.Date

object TraitDemo05 {

  trait Logger{
    val sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    def  log(msg:String)

  }

  class ConsoleLogger extends Logger{
    override def log(msg: String): Unit = {
      val info = s"${sdf.format(new Date())}:控制台消息：${msg}"
      println(info)
    }

  }


  def main(args: Array[String]): Unit = {
      val logger = new ConsoleLogger
      logger.log("NullPointerException")
  }

}
