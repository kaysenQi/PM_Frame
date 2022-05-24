package chapter02.Mar16.Mar19

import scala.collection.mutable

object Test02 {

  def main(args: Array[String]): Unit = {

  /*  var ls: List[Int] = List(1, 2, 3, 4, 5)

    var f1: ((Int, Int) => Int, (Int, Int) => Int) => Int = ls.aggregate(0)

/*    val i: Int = f1((x, y) => x + y, (x, y) => x + y)

    println(i)*/

    val i = ls.aggregate(0)(_ + _, _ + _)
    println(i)

   */

    val set01 = Set(11, 22, 44, 53, 2, 4, 66, 35, 10)

    println(set01.size)

    println("----------------幸福分割线---------------------")

    for (e <- set01) {
      println(e)
    }
//    set01 += (101)  不可变的set用的是.+  可变的set用的才是 +=

    val it = set01.+(101)
    println(it)

    println("--------------------HashSet分割线--------------------------")

    val hs = mutable.HashSet(14, 2, 33, 41, 422, 42, 10, 101, 19)
    println(hs)
    for (e <- hs) {
      println(e)
    }

    hs += (10001)

    println(hs)

    println("-------------------list 转set -----------------------")
    val ls01 = List(11, 22, 22, 433, 1, 3, 55, 44, 53, 55)
    val lset = ls01.toSet
    println(lset)   //list 转set 相当于去重

    println("----------------------Map集合-------------------------")
    val hm = mutable.HashMap[Int, String](1001 -> "Tom", 1001 -> "Lusy", 1002 -> "Jack", 1003 -> "Mark", 1004 -> "Alex")
    println(hm)
    val ls = hm.toList
    println(ls)
    val st = ls.sorted
    println(st)
    val ms = st.toMap
    println(ms)

    val mb = hm.get(1003)
    println(mb)

    val str = hm.getOrElse(1009, "hello Scala")  //找1009  找不到返回hello Scala
    println(str)

  }


}
