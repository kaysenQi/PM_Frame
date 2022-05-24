package chapter02.Mar16.Mar17

object Test06 {

  def main(args: Array[String]): Unit = {


  }

  //遍历的数组的三种方式 1.to两头包 2. utils 后面不包  3.foreach
  //还有一种方法,直接foreach
  var arr = Array(15, 2, 39, 42, 605, 69, 7, 11, 3, 54)

//  arr.foreach(println(_))
  arr.foreach(println)

  private val ints: Array[Int] = arr.sortWith((x, y) => x > y)
  println(ints.toBuffer)  //这样是降序 (605, 69, 54, 42, 39, 15, 11, 7, 3, 2)

  private val ints1: Array[Int] = arr.sortWith((x, y) => x < y)
  println(ints1.toBuffer)

  private val sorted: Array[Int] = arr.sorted
  println(sorted.toBuffer)   //默认的是升序(2, 3, 7, 11, 15, 39, 42, 54, 69, 605)

  private val ints2: Array[Int] = arr.sortBy(x => x % 2 == 0)
  println(ints2.toBuffer)  //(15, 39, 605, 69, 7, 11, 3, 2, 42, 54) 按照模与的数进行计算

  private val ints3: Array[Int] = arr.filter(x => x % 2 == 0)
  println(ints3.toBuffer)  //(2, 42, 54)


  println(arr.max)
  println(arr.min)
  println(arr.sum)
  println(arr.count(x => x > 11))
  println(arr.count(x => x > 0))
  println(arr.size)
  println(arr.length)

  //求平均值
  println(arr.sum / arr.size)

}
