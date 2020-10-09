package com.atguigu

import scala.collection.immutable.Range

object Test_Datacast {
  def main(args: Array[String]): Unit = {
    // 1. 自动类型转换
    //（1）自动提升原则：有多种类型的数据混合运算时，系统首先自动将所有数据转换成精度大的那种数据类型，然后再进行计算。
    val a1: Byte = 12
    val b1: Short = 25
    val c1: Short = a1
    val res1: Int = a1 + b1
    val res2: Int = res1 + c1
    println(a1,b1,c1,res1,res2)

    //（2）把精度大的数值类型赋值给精度小的数值类型时，就会报错，反之就会进行自动类型转换。
    val a2: Byte = 23
    val b2: Short = 46
    //val c2: Byte = b2 error

    //（3）（byte，short）和char之间不会相互自动转换。
    var a3: Byte = 10
    var b3: Short = 23
    var c3: Char = 'a'

    b3 = a3
    //    a3 = b3    // error
    //    c3 = a3    // error
    //    b3 = c3    // error
    println(b3)

    //（4）byte，short，char他们三者可以计算，在计算时首先转换为Int类型。
    val a4: Byte = 10
    val b4: Short = 32
    val c4: Char = 'a'
    val res4: Int = a4 + b4 + c4
    println(res4)

    //强制类型转换
    val  c2: Byte = b2.toByte
    println(c2)

    //求2.55和3.67的和，取整数
    val n1: Int = 2.55.toInt + 3.67.toInt
    val n2: Int = (2.55 + 3.67).toInt
    println(n1,n2)

    // 3. 数值类型与String的转换
    // 数值->String
    val str1 = 45.123.toString
    val str2 = 12 + ""
    println(str1,str2)

    // 字符串-> 数值
    // val num1: Int = "12.3".toInt
    val num:  Int = "123.4".toFloat.toInt
    println(num)
  }
}
