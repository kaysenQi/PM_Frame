package Aprli01

object Test04_LazyLoad {

  def main(args: Array[String]): Unit = {

    // 懒加载(注意: 懒加载定义的必须是一个常量值)
    lazy val result: Int = sum(11, 22)

    println("1.函数调用")
    println("2.调用result:(这一步执行是在有值以后才执行...)" + result)
    println("4.继续调用懒函数:" + result)
    println("5.继续调用懒函数:" + result)

    def sum(a: Int, b: Int) = {
      println("3.这里是sum函数,调用完sum函数会生成一个返回值,这时就可以调用懒函数了")
      a + b
    }

  }
}
