package chapter02.Mar16

import scala.io.StdIn

//半生类,半生对象的所属类必须在用一个文件夹下,名字且一样
//

class Student(name : String, var age : Int) {

  def printerInfo(): Unit = {
    println(name + " " + age + " " + Student.school)
  }

}

object Student {

//  /**
//  *
//  * 我我我
//  * */
//  /**
//   * 我我我我
//   * 我我我我我
//   * 我我
//   */

  val school: String = "at henan"

  def main(args: Array[String]): Unit = {

    //这里定义了对象,但是是不可变的对象
    //要想定义可变的参数,就只需要把定义是的参数改为可变参数即可
    val xx = new Student("xx", 18)
    val ss = new Student("ss", 20)

    ss.age = 30

    xx.printerInfo()
    ss.printerInfo()

    var h_b = 123

    println(h_b)

//    var `if` = 10
//
//    println(`if`)
//    var 123abd = "abc"  错误命名

//    var a11 : Int = 10
//    println(a11)

//    var name = "kaysen"
//    var age = 24
//
//    printf("name %s age %d\n", name, age)
//
//    println(s"${name} at henan ${age}岁了")

//    var sql =
//      s"""
//        |select *
//        |from
//        | Student
//        |where
//        | name = ${name}
//        |and
//        | age >= ${age}
//        |
//        |""".stripMargin

    //格式化多行输出
//    var sql =
//      s"""
//        |select *
//        |from
//        | student
//        |where
//        | name = ${name}
//        |and
//        | age > ${age}
//        |""".stripMargin
//
//    println(sql)

//    println("请输入你的名字:")
//    val name: String = StdIn.readLine()
//    println("请输入你的年龄:")
//    val age: Int = StdIn.readInt()
//
//    println(s"您输入的年龄是${age},您的名字是${name}")

//    println("请输入您的名字:")
//    val name: String = StdIn.readLine()
//    println("请输入您的年龄:")
//    val age: Int = StdIn.readInt()
//
//    println(s"您输入的名字是${name},您的年龄为${age}")

    //StdIn.readLine()
    println("请输入您的名字:")
    val name: String = StdIn.readLine()
    println("请输入您的年龄:")
    val age: Int = StdIn.readInt()
    println(s"你的年龄为${age},你的名字为${name}")


  }
}
