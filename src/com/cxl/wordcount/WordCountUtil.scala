package com.cxl.wordcount

object WordCountUtil {

  def reduce(wordCountTuples: List[(String, Int)]): Map[String, Int] ={
    //将元组的信息进行分组,得到一个key和value，key是单词，List存储是元组
    val wordCountMap: Map[String, List[(String, Int)]] = wordCountTuples.groupBy(_._1)
    //聚合统计
    val wordCountResultMap: Map[String, Int] = wordCountMap.map({
      map =>
        val word = map._1
        val total = map._2.map(_._2).sum
        word -> total
    })

    wordCountResultMap
  }

}
