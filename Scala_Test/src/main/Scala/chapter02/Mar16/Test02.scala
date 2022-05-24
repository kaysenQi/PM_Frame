package chapter02.Mar16

import java.io.{File, PrintWriter}

import scala.io.Source

object Test02 {

  def main(args: Array[String]): Unit = {

    Source.fromFile("G://a.txt").foreach(print)

    val write = new PrintWriter(new File("G://out.txt"))
    write.println("hello world hahahah jajajajaja")
    write.close()

  }
}


