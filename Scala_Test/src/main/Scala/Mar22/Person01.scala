package Mar22

class Person01 extends Person {

  override def show(): Unit ={
    println("这是Scala中,实现Scala中的抽象类...")
  }
}

object Person01 {
  def apply(): Person01 = new Person01()
}