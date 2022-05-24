package chapter02.Mar16.Mar17

object Test04 {

  def main(args: Array[String]): Unit = {


  }

  /*
  * 方法和函数的对比
  * 函数在定义的时候先写 参数类型,不声明参数
  * 而方法在定义的时候,不仅仅先定义参数,而且还要声明参数的类型
  * */

  var f1:(Int, Int) => Int = (x, y) => x + y
  //1.名字后面和参数连接用:
  //2.和返回值连接用=>
  //3.方法体内先声明形参,后面跟的是执行体,用=>相联
  private val i1: Int = f1(2, 2)
  println(i1)

  def p(x:Int, y:Int): Int = x + y
  //1.方法声明时,方法名后面没有符号
  //2.生名方法是,形参和类型一定要声明,可以把方法当作主要的,函数当作是辅助的
  //3.声明返回值用冒号 ,没有=>号     三个:号

  private val i: Int = p(1, 9)
  println(i)

}
