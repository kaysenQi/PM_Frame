package Mar28

object Func_Test01 {

  def main(args: Array[String]): Unit = {

  /*  def f9(name: String): Unit = {
      println(name)
    }

    (name: String) => { println(name) }
      println("==============================")*/

    val fun: String => Unit = (name: String) => {
      println(name)
    }

    fun("at China")

    def f(funccc: String => Unit) = {
      funccc("at China")
    }

    f(fun)

    println("===========幸福分割线==============")

    println(f(fun))


  }

}
