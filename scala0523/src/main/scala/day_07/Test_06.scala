package day_07

object Test_06 {
  def main(args: Array[String]): Unit = {
    //基本语法
    val x: Any = "abc"
    val y: String = x match {
      case 1 => "one"
      case 2 => "two"
      case "abc" => "ABC"
      case _ => "more"
    }
    println(y)

    //运算符匹配示例
    val a: Int = 25
    val b: Int = 13

    def dualOpMatch(op: Char): Any = op match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case _ => "运算符不支持或不合法"
    }
    println(dualOpMatch('+'))
    println(dualOpMatch('%'))

    //模拟守卫
    //求整数绝对值
    def abs(num: Int): Int ={
      num match {
        case n if n >= 0 => n
        case n if n < 0 => -n
      }
    }
    println(abs(-6))
    println(abs(0))
    println(abs(23))

  }
}
