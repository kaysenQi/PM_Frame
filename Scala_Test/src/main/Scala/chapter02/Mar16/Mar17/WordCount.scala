package chapter02.Mar16.Mar17

object WordCount {

  def main(args: Array[String]): Unit = {


  }

  //普通
  var arr = Array("hello zhangsan hello scala hello scala", "tom jack hello jack tom scala lucy")

  private val st: Array[Array[String]] = arr.map(x => x.split(" "))
  private val flatten: Array[String] = st.flatten
  private val rdd: Map[String, Array[String]] = flatten.groupBy(x => x)
  private val rdd02: Map[String, Int] = rdd.mapValues(x => x.size)
  println(rdd02.toBuffer)
  private val rdd04: List[(String, Int)] = rdd02.toList.sortWith((x, y) => x._2 > y._2)
  println(rdd04)

  //一条线
//  private val rdd05: Array[Nothing] = arr.flatMap(toString.split(" ")
//    .groupBy(x => x).mapValues(x => x.size)
//    .toArray.sortBy(x => x._2))
//  println(rdd05)
//private val rdd05: Array[Nothing] = arr.flatMap(_.split(" ")).groupBy(x => x).mapValues(_.length)
  // .toArray.sortWith((x, y) => x._2 < y._2)
//
//  println(rdd05.toBuffer)

  println(arr.flatMap(_.split(" ")).groupBy(x => x).mapValues(_.length)
    .toList.sortWith((x,y) => x._2 > y._2))







}
