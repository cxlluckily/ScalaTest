package com.cxl.wordcount

import java.io.File

import scala.actors.Future


object MainActor {

  def main(args: Array[String]): Unit = {
    //读取需要处理的文件目录
    val dir = "./data/"
    val file = new File(dir)

    //获得一个路径和文件名的列表
    val fileNameDir = file.list().toList.map(dir+_)

//    fileNameDir.foreach(println(_))


    //根据文件名，创建对应的actor
    val wordCountActors = fileNameDir.map(_ => new WordCountActor())

    //将文件名和Actor使用拉链组合
    val wordCountTuples = wordCountActors.zip(fileNameDir)


    //启动Actor并向每个Actor发送文件名
    val futureList: List[Future[Any]] = wordCountTuples.map(
      {
        tuple =>
          //启动Actor
          tuple._1.start()
          //向Actor发送异步不等待消息
          val future = tuple._1 !! WordCountTask(tuple._2)

          future
      }
    )


    //判断是否所有的结果都已经返回
    while (futureList.filter(!_.isSet).size != 0){}

    val wordCountList: List[Map[String, Int]] = futureList.map(_.apply().asInstanceOf[WordCountResult].wordcountMap)

    val flatten: List[(String, Int)] = wordCountList.flatten


    val wordCountResult: Map[String, Int] = WordCountUtil.reduce(flatten)

    wordCountResult.foreach(
      map => println(map._1 + "=" + map._2)
    )


  }

}
