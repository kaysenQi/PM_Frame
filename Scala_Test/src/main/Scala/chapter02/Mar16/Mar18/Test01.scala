package chapter02.Mar16.Mar18

import javax.rmi.CORBA.Util

object Test01 {

  def main(args: Array[String]): Unit = {}

  //这些都是静态类,静态加载的...在加载main方法之前.都会跑下static的方法
  show(1, 2, 3, 4, 5)

    def show(arr: Int*): Unit = {

      for (e <- arr) {
        println(e)
      }

      def play(a: Int = 20, b: Int = 30) = {
        a + b
      }

      //为什么Scala中的方法不在main中也可以运行?
      val i = play()
      println(i)

      var f1 = (x: Int, y: Int) => x + y

      def show01(x: Int, y: Int, f: (Int, Int) => Int): Int = {
          f(x, y)
      }

      var f2 = (x: Int, y: Int) => x + y

      def show02(x: Int, y:Int, f:(Int, Int) => Int): Int = {
        f(x, y)
      }

      show02(20, 30, f2)

      show01(10, 20, f1)

      show02(1, 1, _ + _)   //匿名函数
      show01(2, 2, _ - _)

      //柯里化函数

      def show03(x: Int)(y: Int) = {
        x + y
      }

      val i1 = show03(10)(2)

      println(i1)

      var i01: Int => Int = show03(12)
      var j01: Int => Int = show03(10)
      println(i01(10))

      //偏函数
      //偏函数,相当于java中的case
      val p1 = PartialFunction[Int, String] {
        case 1 => "这是one"
        case 2 => "这是two"
        case 3 => "这是three"
        case 4 => "这是four"
        case 5 => "This is five"
        case _ => "抱歉,我也不知道这个..."
      }

      val s = p1(2)
      println(s)

//      val s1 = p1(8)
//      println(s1)   scala.MatchError: 8 (of class java.lang.Integer)

      val s2 = p1(90)
      println(s2)

      //判断数据类型
      val v = PartialFunction[Any, Unit] {

        case x: Int => println("这是Int类型" + x)
        case x: Double => println("这是Double类型" + x)
        case x: Float => println("这是Float类型" + x)
        case x: String => println("这是String类型" + x)
        case _ => println("这是未知i类型...")
      }

      val unit = v(10)
      println(unit)












  }

}
