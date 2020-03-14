package com.cxl.traitdemo

object TraitDemo02 {

  trait MessageSender{

    def send(msg:String)

  }

  trait MessageReceiver{

    def receive():String

  }


  class MessageWorker extends MessageSender with MessageReceiver{
    override def send(msg: String): Unit = println(s"发送消息：${msg}")

    override def receive(): String = "消息回复"
  }


  def main(args: Array[String]): Unit = {
    val worker = new MessageWorker
    worker.send("你好")
    println(worker.receive())

  }

}
