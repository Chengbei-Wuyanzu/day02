package com.atguigu

class Test_Datatype {
  def main(args: Array[String]): Unit = {
    //整型
    val a: Byte = 127
    val b: Int = 10
    val c = 1234567891234L

    //浮点
    val d: Float = 10.9f

    //字符型
    val e: Char = 'a'
    val f: Char = '\t'

    //Unit,Null,Nothing
    def fun(): Unit ={
      println("fun")
    }
    val g: Unit = fun()
    println(g)

    //Null

    //Nothing
    def fun2(n: Int): Nothing = {
      if(n == 0)
        throw new NullPointerException
      else
        throw new RuntimeException
    }
    val h = fun2(0)
    println(h)



  }
}
