package chapter02.Mar16.Mar17

object Test03 {

  def main(args: Array[String]): Unit = {

  }

    //定义函数的第一种方法
  var show01:(Int, Int) => Int = {(x, y) => x + y }
  var show:(Int, Int) => Int = {(x, y) => x * y}

  //定义函数的第二种方法(匿名函数)
  var show02 = {(x:Int, y:Int) => x + y}

  //arr.map()
  var f1 = (x: Int) => x + 10
  var arr = Array(1, 2, 3, 4, 5, 6)

  val ints: Array[Int] = arr.map(f1)
  println(ints.toBuffer)

  val ints1: Array[Int] = arr.map((x: Int) => x + 20)

  println(ints1.toBuffer)

  private val ints2: Array[Int] = arr.map(x => x + 30)

  println(ints2.toBuffer)

  private val ints3: Array[Int] = arr.map(_ + 40)

  println(ints3.toBuffer)

  private val arrs: Array[String] = arr.map(_ + "*")

  println(arrs.toBuffer)

  def show03(x: Int, y:Int): Int = {x + y}

  private val f3: Any = show03(1, 2)

  println(f3)

  var f4 = (x: Int, y: Int) => x + y

  private val i: Int = f4(2, 2)

  println(i)

  var f5 = (x: Int, y: Int) => x * y

  /*
  * 当方法中定义函数时,在参数栏中定义的函数仅仅是:函数传入的类型+返回值,再加上函数的格式
  * 只要符合这种格式的函数,不管是什么方法体都可以  所以在调用方法时,要传入指定的函数
  * 细节!!!:方法一定要记得加上返回值,默认的返回值是空,在scala中,所有的变量都有返回值
  * */

  def myMap(x: Int, y: Int, f: (Int, Int) => Int): Int = {
    val i2: Int = f(x, y)
    i2 //默认最后一行是返回值,不需要加上return
  }

  private val i1: Int = myMap(10, 20, f4)

  private val i2: Int = myMap(2, 4, f5)

  println(i1)

  println(i2)


}
