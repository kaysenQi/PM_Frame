package chapter02.Mar16.Mar17

import javax.rmi.CORBA.Util

object Test02 {

  def main(args: Array[String]): Unit = {

    show()
    show(1011111221)
    show("jajajajajajaaaaa")


  }

  //定义一个方法

  def show(): Unit = {
    println("hello Scala Method, Today is very happy now!!!")
  }

//  def show(a:Int): Int = {
//
//    println(a)
//  }  为什么这样做会报错?  因为println的返回值是 Unit 空值

  def show(a:Int) = {
    a + 10
  } //不写返回值默认推算

  def show(s:String) = {
      10
    println(s)
  }

}
