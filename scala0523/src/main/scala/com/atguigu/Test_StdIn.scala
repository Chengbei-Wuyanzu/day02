package com.atguigu

import scala.io.StdIn

object Test_StdIn {
  def main(args: Array[String]): Unit = {
    //可以用print，println打印输出
    var a = 23
    var b = 'v'
    var str = "La"
    print(a)
    println(b)
    println(str)

    //1.字符串，通过+号连接
    val age: Int = 23
    val name: String = "Henry"
    println("age: " + age + "\t" + "name:" + name)

    //2.printf用法：格式化输出字符串，通过%传值
    val score = 123.456789
    printf("age: %d name: %s :%.2f",age,name,score)

    //3.字符串模板：通过$获取变量值
    println(s"${age} ${name} study in atguigu:$score")

    //多行字符串
    val sql =
      s"""
        |select *
        |from
        | table
        |where name = $name
        |""".stripMargin
    println(sql)
  }
}
