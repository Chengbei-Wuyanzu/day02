package com.atguigu

object Test_Operator {
  def main(args: Array[String]): Unit = {
    //1.算数运算符
    val a1: Int = 10 / 3
    val b1: Double = 10 / 3
    val c1: Double = 10.toDouble / 3
    println(a1,b1,c1)
    println(f"${c1}%.2f")

    //2.比较运算符
    val a2: String = "abc"
    val b2: String = new String("abc")
    println(a2 == b2)
    println(a2.equals(b2))
    println(a2.eq(b2))

    //3.逻辑运算符
    def isNotEmpty(str: String): Boolean = {
      // 如果返回true，要求str不为null，而且不为空字符串""，也不为空白符
      return  str != null && "".equals(str.trim)
    }
    //4.位运算符
    val a4 = 25
    val b4 = -13
    println(a4 << 2)    // 乘以4，100
    println(a4 >> 2)    // 除以4，6
    /*
   * -13
   * 原码 1000 0000 0000 0000 0000 0000 0000 1101
   * 补码 1111 1111 1111 1111 1111 1111 1111 0011
   * 右移2位
   * 1111 1111 1111 1111 1111 1111 1111 1100
   * 原码：1000 0000 0000 0000 0000 0000 0000 0100
   * */
    println(b4 >> 2)    // 有符号数，右移时左端补符号位，-4
    println(b4 >>> 2)

    (a1 + b2) + c1

    a4.<<(2)

    13 toString()
    1./(2)
  }

}
