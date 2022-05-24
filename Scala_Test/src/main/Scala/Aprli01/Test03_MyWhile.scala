package Aprli01

object Test03_MyWhile {

  def main(args: Array[String]): Unit = {

 /*   def myWhile(condition: =>Boolean): (=>Unit)=>Unit = {

      def loop(op: => Unit): Unit = {
        if (condition){
          op
          myWhile(condition)(op)
        }
      }
      loop _
    }

    var n = 10
    myWhile( n >= 1){
      println(n)
      n -= 1
    }*/

    //用匿名函数去表达
  /* def myWhile(condition: => Boolean): (=>Unit)=>Unit = {
      op => {
        if (condition){
          op
          myWhile(condition)(op)
        }
      }
    }

    var n = 10
    myWhile(n >= 1){
      println(n)
      n -= 1
    }*/


    //用柯里化去实现
    def myWhile(condition: =>Boolean)(op: =>Unit): Unit = {

      //用柯里化实现的话,里面就不需要再次声明函数,  直接用参数调用即可
      //传名参数用柯里化是最简单的
      //闭包最简单的写法就是柯里化写法
      if (condition){
        op
        myWhile(condition)(op)
      }
    }

    println("=====================")
    var n = 10
    myWhile(n >= 1){

      println(n)
      n -= 1
    }







  }
}
