package Aprli01

object Test02_ControlAbstract {

  def main(args: Array[String]): Unit = {

 /*   //1.传值参数
    def f0(a: Int) = {
      println("a:" + a)
      println("a:" + a)
    }

    def f1() = {
      println("f1调用")
      12
    }

    f0(f1())*/

    //2.传名参数(传递的不再是任何一个值,而是一个代码块)
    //这的代码块:参数为空,返回值为Int
    def f0(a: =>Int ) = {
      println("a:" + a)
      println("a:" + a)
    }

    def f1() = {
      println("f1调用")
    }

    //在往f0中调用的时候,传进去的就是一个代码块 但这个代码块的返回值必须是一个Int类型
    f0({
      println("这是一个代码块")
      88
    })
  }
}
