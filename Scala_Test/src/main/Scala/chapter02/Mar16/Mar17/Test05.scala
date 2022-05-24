package chapter02.Mar16.Mar17

import scala.collection.mutable.ArrayBuffer

object Test05 {

  def main(args: Array[String]): Unit = {

    //array是不可变数组, 不可变数组. 不可变数组, 不可变数组
    val arr = Array(1, 2, 4, 5, 6 ,77, 88)


    var buf = ArrayBuffer(11, 22, 44, 55, 66, 77)

    buf += 100
    buf += 101
    buf += 102

    println(arr)  //[I@1d251891  打印的是地址值
    println(buf)  //ArrayBuffer(11, 22, 44, 55, 66, 77, 100, 101, 102)

    for (e <- buf) {
      println(e)
    }

    val ints = arr.map(x => x * 10)
    println(ints.toBuffer)   //为什么用一个toBuffer就可以输出全部值了

    //自定义map类
    def map01(arr: Array[Int]) = {

      val buffer = ArrayBuffer[Int]()
      for (e <- arr) {
        buffer += (e * 100)
      }

      buffer.toArray
      buffer
    }

    //课堂练习题目: 如果在每个数字后面加上 一个星号 * 该如何做?
    def map02 (arr: Array[Int]) = {

      //先定义一个buffer,因为每次加工过的元素要放入到buffer中去
      val buffer = ArrayBuffer[String]()
      for (e <- arr) {
        buffer += (e + "*")
      }
//      buffer.toArray
      buffer
    }

    println(map02(arr))

    val s = map02(arr)

    for (e <- s) {
      println(e)
    }

//    println(map01(arr))

    val s02 = arr.map(_ + "*")
    println(s02.toBuffer)
    for (e <- s02) {
      println(e)
    }


  }
}
