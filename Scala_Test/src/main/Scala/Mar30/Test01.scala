package Mar30

object Test01 {

  def main(args: Array[String]): Unit = {

    //预习      ----------------------------------------------今天是五月二十四号,测试复杂的GitHub------------从远程库拉取下来--------------------------
 /*   def func(i: Int): Char=> Boolean ={

      func1(s: String): Char => Boolean = {
        func2(c: Char): Boolean = {

        }
      }
    }*/

    //测试
   /* def func(i: Int): String=> (Char => Boolean) = {

      def func1(s: String): Char=>Boolean = {

        def func2(c: Char): Boolean = {

          if (i == 0 && s == "" && c == "0") false else true
        }
        func2
      }
      func1
    }*/

    //测试2
/*    def func0(i: Int): String => (Char => Boolean) = {

      def func1(s: String): Char => Boolean = {

        def func2(c: Char): Boolean = {
          if (i == 0 && s == " " && c == '0') false else true
        }
        func2
      }
      func1
    }

    println(func0(2)("www")('0'))*/

 /*   def func0(i: Int): String => (Char => Boolean) = {

      def func1(s: String): Char => Boolean = {

        // && 有一个为true 都是true
        // || 有一个为false 都为false
        def func2(c: Char): Boolean = {
          if (i == 0 && s == "" && c == '0') false else true
        }
        func2
      }
      func1
    }
    println(func0(4)("")('0'))*/
/*
    //匿名函数的用法(函数作为返回值的用法)
    def func0(i: Int): String => (Char => Boolean) = {

      s => c => if (i == 0 && s == "" && c == '0') false else true

    }

    println(func0(2)("xxx")(2))

  }

  def func1(s: String): Char => (Int => Boolean) = {
    c => i => if (s == "" && c == '0' && i == 0) false else true
  }

  println("=====================幸福分割线=========================")

  //柯里化
  def curri(i: Int)(s: String)(c: Char) = {
    if (i == Int && s == "" && c == Char) false else true
  }

  println(curri(2)("")(19))*/

/*  //柯里化
    def addCurrying(a: Int)(b: Int): Int = {
      a + b
    }

    println(addCurrying(22)(11))*/
/*

    //将固定的参数,当做值放入函数中
    def func1(): Int => Int = {
      val a = 4
      def addByFour01(b: Int): Int = {
        a + b
      }
      addByFour01
    }

    //这个就是闭包函数,将外部变量和内部函数封装在一起,内部函数作为返回值,外部函数的参数可以让内部函数使用
    //外部函数的参数,和内部函数一起构成的函数叫做闭包函数
    def func2(a: Int): Int => Int = {

      def addByFour02(b: Int): Int = {
        a + b
      }
      addByFour02
    }

    println(func1()(1))
    println(func2(4)(2))

*/
/*
    def func3(a: Int):Int => Int = {

      def addByFour02(b: Int): Int = {
        a + b
      }
      addByFour02
    }

    val function = func3(4)
    println(function(4))
    println("====================幸福分割线=======================")

    //闭包函数用lambda写法
    def func4(a: Int):Int => Int = {
      b => a + b
    }

    //lambda的简化版   简化原则: 只出现一次的变量,可以用_  表示
    def func5(a: Int):Int => Int = {
      a + _
    }

    println(func4(1)(1))
    println(func5(2)(2))*/

    //用柯里化进行闭包
    def func(a: Int)(b: Int): Int = {
      a + b
    }

    val function = func(1)(1)
    println(function)
    




  }


}
