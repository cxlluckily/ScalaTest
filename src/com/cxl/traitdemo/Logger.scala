package com.cxl.traitdemo

trait Logger extends MyUtils {
  def log(msg:String) = printMsg(msg)
}
