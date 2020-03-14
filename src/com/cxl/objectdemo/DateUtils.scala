package com.cxl.objectdemo

import java.text.SimpleDateFormat
import java.util.Date

object DateUtils {

  private val simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd")

  def format(date:Date) = simpleDateFormat.format(date)

}
