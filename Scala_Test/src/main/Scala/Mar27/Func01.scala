package Mar27

object Func01 {

  def main(args: Array[String]): Unit = {

    //第一种:可变参数
    def f1(str: String*) = {
      printf("输入的参数是:%str", str)
    }
    f1("Nike", "at home", "lear study")

    //第二种:多个参数时,多参放在最后面
    


  }

}
