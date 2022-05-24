package chapter02.Mar16.Mar19

object Test03 {

  def main(args: Array[String]): Unit = {

    val m01 = Map(1001 -> "Tom", 1002 -> "Jacl", 1003 -> "Mark", 1004 -> "Alex", 1001 -> "Lusy", 1005 -> "Unix")
    println(m01)

    val ml = m01.toList
    val lms = ml.sorted
    println(lms)
//    val m02 = lms.toMap
//    println(m02)
    for (e <- m01) {

      println(e._1 + "----幸福分割线----" + e._2)

    }

    val i = m01.count(x => x._2.contains("a"))
    println(i)

    val i1 = lms.count(x => x._1 % 2 == 0)
    println(i1)

    val intToString = m01.filter(x => x._1 % 2 == 0) 
    println(intToString)

    def show(x: Int, y: Int) = {
      (x + y, x - y, x * y, x / y)
    }

    val tuple = show(100, 10)
    println(tuple)
    println(tuple._4)



  }
}
