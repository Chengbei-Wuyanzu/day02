package com.atguigu

import scala.io.StdIn

object Test02 {
  //标准控制台输入
  def main(args: Array[String]): Unit = {
    println("Input your name:")
    val name: String = StdIn.readLine()
    println("Input your age:")
    val age: Int = StdIn.readInt()

    println(s"Welcome ${age} age ${name} study in atguigu")
}

}
