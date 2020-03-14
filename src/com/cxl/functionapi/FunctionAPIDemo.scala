package com.cxl.functionapi

object FunctionAPIDemo {

  def main(args: Array[String]): Unit = {

    //0.准备集合
    val list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    //1.map--就是对集合中的每一个元素进行操作并将操作的结果返回
    val ints1: List[Int] = list.map((a) => {a * 10})
    val ints2 = list.map(a => a * 10)
    val ints3 = list.map(_ * 10)
    println(ints1)
    println(ints2)
    println(ints3)



    //2.foreach--就是对集合中的每一个元素进行遍历
    list.foreach((a) => {println(a)})
    list.foreach( a => println(a))
    list.foreach(println(_))
    list.foreach(println)



    //3.flatMap
    val list3: List[String] = List("hadoop hive spark flink flume", "kudu hbase sqoop storm")
    val stringses1: List[Array[String]] = list3.map((a) => a.split(" "))
    val stringses2: List[Array[String]] = list3.map(a => a.split(""))
    val stringses3: List[Array[String]] = list3.map(_.split(" "))


    val flatten: List[String] = stringses1.flatten


    val strings: List[String] = list3.flatMap(_.split(" "))
    println(strings)


    //4.filter
    val ints = list.filter(a => a % 2 ==0)
    val ints4 = list.filter(_ % 2 ==0)
    println(ints)
    println(ints4)

    //5.groupby
    val stus: List[(String, String)] = List("张三"->"男", "李四"->"女", "王五"->"男")


    //6.reduce


    //7.fold




  }

}
