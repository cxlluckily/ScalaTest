package com.cxl.wordcount


case class WordCountTask(fileName:String)


case class WordCountResult( wordcountMap: Map[String, Int])