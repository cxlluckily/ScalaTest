package com.cxl.wordcount

import scala.actors.Actor
import scala.io.Source

class WordCountActor extends Actor{

  override def act(): Unit = {
    loop{
      react{
        case WordCountTask(fileName) => {
          //处理并统计单词出现个数，并封装结果返回给MainActor
          val iterator: Iterator[String] = Source.fromFile(fileName).getLines()
          //得到每一行数据
          val lines: List[String] = iterator.toList
          //
          val wordList: List[String] = lines.flatMap(_.split(" "))
          //统计每个单词出现的次数，一个list存储元组信息
          val wordCountTuples: List[(String, Int)] = wordList.map((_,1))

          val wordCountResultMap = WordCountUtil.reduce(wordCountTuples)

          sender ! WordCountResult(wordCountResultMap)
//          println(this + fileName)
        }
      }
    }
  }
}
