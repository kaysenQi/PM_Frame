package Mar22

object Test01 {

  def main(args: Array[String]): Unit = {

  /*  val stu: Student = Student.apply()
    stu.name = "Tom"
    stu.age = 20
    println(stu.name)
    stu.show()

    val p = Person01.apply()
    p.show()

    for ( i <- 10 to 1 by -3){
      println(i)
    }*/

  /*  for (i <- 1 to 9; j <- 1 to i){
      print(s"$i * $j = ${i*j}")
    }*/


   /* for (i <- 1 to 9; j <- 1 to i){
        print(s"$i * $j = ${i*j}\t")
      if (i == j ){
        println()
      }
    }*/

/*    for (i <- 1 to 9){
      var start = 2*i -1
      var space = 9 - i
      println(" " * space + "*" * start)
    }

    //引入变量的方式
    for (i <- 1 to 9; start = 2*i -1; space = 9 - i){
      println(" " * space + "*" * start)
    }*/

    //这种方法好很多
    for (start <- 1 to 17 by 2; space = (17 - start)/2){
      println(" " * space + "*" * start)
    }
  }
}
