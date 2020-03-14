package com.cxl.objectdemo

object ObjectDemo02 {

  object PrintUtil{

    def printSpliter() = {
      println("*" * 10)
    }
  }

  def main(args: Array[String]): Unit = {
    PrintUtil.printSpliter()
  }

}
