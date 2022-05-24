package chapter02.Mar16.Mar17

object Test01 {

  def main(args: Array[String]): Unit = {

    show()

//    //for 循环, yield, 和守卫( guards) (for loop 'if' conditions)
//
//    var arr = Array (11, 22, 34, 44, 55 ,66)
//
//    var a = for (e <- arr if (e % 2 == 0)) yield e * 2
//
//    //for循环加上if,通常是做测试用的,守卫
//    println(a)

//    for (i <- a) {
//      println(i)
//    }
//
//    for (i <- 1 to 9; j <- 1 to i) {
//
//      print(s"${i}*${j}=${i*j}\t")
//      if (j == i)  println()
//    }
//
//    //求数组的和
//    val arr02 = Array(11, 22, 33, 44, 55, 66)
//    var sum = 0
//    for (e <- arr02) {
//        sum += e
//    }
//
//    println(sum)

    var arr01 = Array(299, 38, 20, 78, 90, 199, 48, 168)
    for (i <- 0 to(arr01.length - 1); j <- 0 until(arr01.length)) {

      val h = arr01(i)
      val f = arr01(j)

      if (h < f) {
        arr01(i) = f
        arr01(j) = h
      } //ArrayBuffer(20, 38, 48, 78, 90, 168, 199, 299)
    }   //为什么是相反的

    println(arr01.toBuffer)


  }

  def show() = {

    println("我是show方法...")
  }
}
