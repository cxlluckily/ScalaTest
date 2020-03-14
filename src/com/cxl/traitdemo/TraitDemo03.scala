package com.cxl.traitdemo

object TraitDemo03 {

  trait Logger{
    def log(message:String)
  }

  object ConsoleLogger extends Logger{
    override def log(message: String): Unit = println("控制台消息："+message)
  }

  def main(args: Array[String]): Unit = {
    ConsoleLogger.log("程序退出")
  }

}
