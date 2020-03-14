package com.cxl.objectdemo

object ObjectDemo05 {

  class CustomerService{

    def save() = {
      println(s"${CustomerService.SERVICE_NAME}:保存客户信息")
    }
  }


  object CustomerService{
    private val SERVICE_NAME = "CustomerService"

    def apply(): CustomerService = new CustomerService()
  }


  def main(args: Array[String]): Unit = {
    val service = new CustomerService
    service.save()

    val service1 = CustomerService()
    service1.save()
  }

}
