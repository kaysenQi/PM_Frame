package Mar18

import scala.collection.mutable

object Test01 {

  def main(args: Array[String]): Unit = {


  }

  var arr = Array("hello zhangsan hello scala hello scala", "tom jack hello jack tom scala lucy")

  println(arr.flatMap(_.split(" ")).groupBy(x => x).mapValues(_.size))

  //Scala中不可变的map集合的创建方式
  val map = Map(("hello", 18), ("Tom", 19), ("Jack", 22))

  println(Map.toString)  //scala.collection.immutable.Map$@4f933fd1  如何遍历Map呢?
  println(map)   //Map(hello -> 18, Tom -> 19, Jack -> 22)

  private val i: Int = map("hello")
  println(i)

  private var s = Map("Jom" -> 18, "Tom" -> 20, "hh" -> 19, "jaja" -> 32)
  println(s)  //Map(Jom -> 18, Tom -> 20, hh -> 19, jaja -> 32)
  println(s.toString)  //Map(Jom -> 18, Tom -> 20, hh -> 19, jaja -> 32)
  println(s.toBuffer)  // ArrayBuffer((Jom,18), (Tom,20), (hh,19), (jaja,32))
  println("-------------幸福分割线--------------")  //如何打印地址值呢?

  private val b: Boolean = s.contains("Jom")
  println(b)

  s += ("Alex" -> 28)

  println(s)

  //区分可变和不可变的map就是把val改为var就行了   !!!敲重点

  println("-------------------------幸福分割线----------------------------")
  private val rdd: Array[String] = Array("hello zhangsan hello scala hello scala", "tom jack hello jack tom scala lucy"
    , "hello zhangsan hello scala hello scala", "tom jack hello jack tom scala lucy")

  private val rdd02: Array[String] = Array(
    """
      |hello zhangsan hello scala hello scala
      |hello zhangsan hello scala hello scala
      |tom jack hello jack tom scala lucy
      |""".stripMargin)

  println("第一次普通字符串遍历......")
  println(rdd.flatMap(_.split(" ")).groupBy(x => x).mapValues(_.length).toArray
    .sortWith((x, y) =>x._2 > y._2).toBuffer)  //最后sortWith中的x,y分别代表第一个字符和第二个字符

//  println("第二次遍历:三引号\"\"\"字符串")
//
//  private val t: List[(String, Int)] = rdd02.toString.split(" ").groupBy(x => x)
//    .mapValues(_.length).toList.sortWith((x, y) => x._2 > y._2)
//
//  for (e <- t) {
//    println(e)
//  }                                 实验失败!!!!

  

}
