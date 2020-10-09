package day_04

object Test_01 {
  def main(args: Array[String]): Unit = {
    def f(): Int ={
      println("f()")
      10
    }
    f()
    println(f)
    println("==========================")

    def fun(name: String): String = {
      name
    }

    //1.函数作为值进行传递
    val f1 = f  //把函数返回值赋给变量
    println(f1)

    val f2:(String) => String = fun
    println(f2)
    f2("")

    //2.函数作为参数传递(定义一个二元运算函数)
    def dualEval(a: Int,b: Int,op: (Int, Int)=>Int): Int = {
      op(a, b)
    }

    //定义一个两数加法函数
    def add(a: Int,b: Int): Int = a + b
    println(dualEval(10,20,add))

    def minus(a: Int,b: Int): Int = a * b
    println(dualEval(10,20,minus))
    println("====================")

    //匿名函数作为参数
    println(dualEval(10,20,(a:Int,b:Int)=>{a+b}))
    //----简化
    println(dualEval(10,20,(a,b) => a + b))
    //----简化
    println(dualEval(10,20,_+_))

    println("=======================")

    //3.函数作为函数返回值
    def f5(): () =>Unit = {
      def f6(): Unit={
        println("f6()")
      }
      //将f6函数体作为返回值返回
      f6 _
    }

    def f8(): () => Unit ={
      () => println("f6()")
    }

    val f7 = f5()        //f7就是f6
    println(f7)
    f7()
    f5()()
    f8()()
  }

}
