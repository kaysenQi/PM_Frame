package Aprli01

import scala.annotation.tailrec

object Test01_Recursion {

  def main(args: Array[String]): Unit = {

//    println(fact(5))

  }

  //递归实现计算阶层
/*  def fact(n: Int): Int = {
    if (n == 0) return 1
    fact(n - 1) * n
  }*/

  //传统的递归会有可能导致内存溢出
  //用尾递归的方式去实现递归的优化 (用闭包的方式)
  def tailFact01(n: Int): Int = {

    def loop01(n: Int, currRes: Int): Int = {
      if (n == 0) return currRes
      loop01(n - 1, currRes * n)
    }

    loop01(n,1)
  }

  def tailFact02(n: Int): Int = {
    @tailrec
    def loop02(n: Int, currRes: Int): Int = {
      if (n == 0) return currRes
          //用递归的方式,将总值当作参数保留起来
      loop02(n - 1, currRes * n)
    }
    loop02(n,1)
  }




}
