package Mar28

object Func_Test02 {

  def main(args: Array[String]): Unit = {

    def func(array: Array[Int], op: Int =>Int) = {
      for (elem <- array) yield op(elem)
    }

    def f(elem: Int): Int ={
      elem * 2
    }

    val v = Array(11, 22, 33, 44, 55)

    val ints = func(v, f)

//    println(ints.foreach(println))

//    ints.foreach(println)

    val s = v.mkString(", ")
    println(s)


    //函数作为参数传递
 /*
    def func02 (op: (Int, Int) => Int, a:Int, b:Int): Int = {
      op(a, b)
    }

    def f2(a: Int, b: Int): Int = {
      a + b
    }

    val u = func02(f2, 10, 20)

    println(u)*/
/*
    //函数作为返回值
    def func03 (): Int => Unit = {

      def f6(a: Int): Unit = {
        println("f6被作为返回值被调用" + a)
      }

      f6

    }

    val it = func03()
//    it(888)
    */

  }
}
