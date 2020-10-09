package day_04

//闭包和柯里化
object Test_04 {
  def main(args: Array[String]): Unit = {
    //首先实现一个基本的两数求和和函数
    def add(a: Int,b: Int): Int = a + b

    //通用性好，适用性差

    //1.闭包的应用场景：大部分情况下,某一个加数是固定的
    def addByFour(b: Int): Int = 4 + b

    //场景扩展：固定加数调整
    def addByFive(b: Int): Int = 5 + b

    //将固定的加数定为参数加入，实现高阶函数
    def addByFour1(): Int => Int = {
      val a = 4
      def addB(b: Int): Int = a + b
      addB
    }
    addByFour1()(5)

    def addByA(a: Int): Int=>Int = {
      def addB(b: Int) = a + b
      addB
    }

    println(addByA(4)(6))

    val addByFour2 = addByA(4)
    val addByFive2 = addByA(5)

    //柯里化
    def addCurrying(a: Int)(b: Int): Int = a + b

    //addCurrying(10)
  }
}
