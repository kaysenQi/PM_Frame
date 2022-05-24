package chapter02.Mar16.Mar18

import javax.rmi.CORBA.Util

object Test02 {

  def main(args: Array[String]): Unit = {


    val l01 =List(11, 22, 33, 44, 55)

    println(l01)
    println(l01(0))
    println(l01.head)
    println("-------------------------------")
    println(l01.tail) //尾部很特殊,
    println(l01.max)
    println(l01.min)
    println(l01.sum)

    //遍历list的si种形式?

    println("Form first ")

    for (e <- l01) {
      println(e)
    }

    println("Form Second")

    //
//    for (e <- 0 to l01.length ) {
//      println(l01(e))
//    }  Exception in thread "main" java.lang.IndexOutOfBoundsException: 5

    //
    for (e <- 0 to l01.length - 1 ) {
      println(l01(e))
    }

    println("Form Three")

//    for (e <- 0 until l01.size) {
//      println(l01(e))
//    }

    println("Form Four")

    l01.foreach(println)

    val ints: List[Int] = l01.+:(100)
    println(ints)

    val ints1 = List(11, 22, 33, 44, 55, 66)

    //创建集合,使用拼接模式
    var list01:List[Int] = 4::2::9::10::Nil

    //每次追加都会生成新的list集合

    //向头部追加数据101  (两种方法)
    val ll01 = list01.+:(101)
    println("ll01是:" + ll01)

    var ll011:List[Int] = list01.::(102)
    println("llo11是:" + ll011)

    //向尾部追加数据1009
    val ll02 = list01.:+(1009)
    println("ll02是:" + ll02)

    //向头部追加list集合ints
    val ll03 = list01.++:(ints)
    println("ll03是:" + ll03)

    //向尾部追加list集合 ints1
    val ll04 = list01 ++ (ints1)
    println("ll04是:" + ll04)

    // 拼接集合
    var copy: List[Int] = ll01:::ll02
    println("集合copy是:" + copy)

    //拼接元素(元组) head
    var copy_tuple:List[Any] = ll01.::(10,11)  //(10,11) 这个是拼接了一个元组的形式
    println("集合copy_e是" + copy_tuple )

    //拼接元素  head
    var copy_e:List[Int] = ll01.::(99)
    println("集合copy_e是:" + copy_e)

    //集合中添加集合
    var copy_list:List[Any] = ll01::List(88, 99)
    println("copy_list的值为:" + copy_list)





  }

}
