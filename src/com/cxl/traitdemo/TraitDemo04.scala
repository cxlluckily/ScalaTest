package com.cxl.traitdemo

object TraitDemo04 {


  trait LoggerDetail{

    def log(msg:String) = println(msg)

  }

  class UserService extends LoggerDetail{
    def add() = log("添加用户")
  }


  def main(args: Array[String]): Unit = {
    val service = new UserService
    service.add()
  }

}
