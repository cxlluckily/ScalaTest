package com.cxl.wordcount

import java.io.File

import scala.io.Source

/**
  * 文件中的单词统计
  */
object WordCount {

  def main(args: Array[String]): Unit = {
//    val list = List(1,2,3,4,5,6,7,8,9,10)
//    val i: Int = list.reduce((a, b) => a+b)
//    println(i)
//
//    val sum = list.sum
//    println(sum)

//    wordcount1()
//
//    println("----------------------")
//
//    wordcount2()
//
//    println("----------------------")

    wordcount3()

  }

  def wordcount1() = {
    //1、读取目录，获取文件
    val dir = "./data/"
    val fileNames: Array[String] = new File(dir).list()
    //    fileNames.foreach(println)
    //2、读取根据文件路径和文件名，读取文件并获取文件中的文本内容
    val lines = fileNames.map(dir + _).flatMap(Source.fromFile(_).getLines().toList)

    //3、切割每一行文本获取单词
    val words: Array[String] = lines.flatMap(_.split(" "))

    //4、计数每个单词出现次数
    val tuples: Array[(String, Int)] = words.map( _ -> 1)

    //5、按单词进行分组
    val wordToTuples: Map[String, Array[(String, Int)]] = tuples.groupBy(_._1)

    //6、打印最终的单词出现个数
    val stringToInt: Map[String, Int] = wordToTuples.mapValues(_.length)

    stringToInt.foreach(println)
  }



  def wordcount2() = {
    //1、读取目录，获取文件
    val dir = "./data/"
    val fileNames: Array[String] = new File(dir).list()
    //    fileNames.foreach(println)
    //2、读取根据文件路径和文件名，读取文件并获取文件中的文本内容
    val lines = fileNames.map(dir + _).flatMap(Source.fromFile(_).getLines().toList)

    //3、切割每一行文本获取单词
    val words: Array[String] = lines.flatMap(_.split(" "))

    //4、按单词进行分组
    val wordToTuples: Map[String, Array[String]] = words.groupBy(k => k)

    //5、打印最终的单词出现个数
    val stringToInt: Map[String, Int] = wordToTuples.mapValues(_.length)

    stringToInt.foreach(println)
  }


  /**
    * 最简方式统计
    */
  def wordcount3()={
    //1、读取目录，获取文件
    new File("./data/")
      .listFiles()//获取文件对象
      .map(_.getAbsolutePath)//读取文件路径
      .flatMap(Source.fromFile(_).getLines().toList)//获取文件的每一行文本
      .flatMap(_.split(" "))//切割空格切割字符串为单词
      .groupBy(k => k)//按单词分组
      .mapValues(_.length)//统计每个单词的次数
      .foreach(println)//控制台打印输出每个单词出现的次数
  }

}
