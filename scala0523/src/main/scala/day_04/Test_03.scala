package day_04

//练习
object Test_03 {
  def main(args: Array[String]): Unit = {
    // 1. 定义一个匿名函数，有三个参数Int，String，Char，返回一个Boolean
    // 如果输入参数是 0, "", '0'时返回false，否则返回true
    val f = (i: Int,s: String,c: Char) => {
      if (i == 0 && s == "" && c == '0') false
      else true
    }
    println(f(0,"",'0'))
    println("=========")


    // 2. 定义一个高阶函数，要求Int，String，Char三个参数嵌套传入，返回一个Boolean
    // fun(0)("")('0') 返回结果为false，其它情况为true
    def fun(i: Int): String => (Char => Boolean) = {
      def fun1(s: String): Char => Boolean={
        def fun2(c: Char): Boolean= {
          if (i == 0 && s == "" && c == '0') false
          else true
        }
        fun2
      }
      fun1
    }
    println(fun(0)("")('0'))
    println("=========")

    //简化
    def func(i: Int): String => (Char => Boolean) ={
      s => c => !(i == 0 && s == "" && c == '0')
    }
    println(func(0)("")('0'))
    println("=========")

    //最简洁方便
    def fund(i:Int)(s:String)(c: Char): Boolean={
      !(i == 0 && s == "" && c == '0')
    }
    println(fund(0)("")('0'))

  }
}
