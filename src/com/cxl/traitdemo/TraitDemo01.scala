package com.cxl.traitdemo


object TraitDemo01 {

  trait Logger{
    def log(message:String)
  }


  class ConsoleLogger extends Logger{
    override def log(message: String): Unit = println("控制台日志："+message)
  }


  def main(args: Array[String]): Unit = {
//    val userService = new UserService
//    userService.printMsg("test")

    val logger = new ConsoleLogger
    logger.log("这是一条日志")

  }

}
