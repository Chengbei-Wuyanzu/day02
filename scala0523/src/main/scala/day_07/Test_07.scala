package day_07

object Test_07 {
  def main(args: Array[String]): Unit = {
    //匹配常量
    def describeConst(x: Any): String = x match {
      case 10 => "Int Ten"
      case "hello" => "String hello"
      case true => "Boolean true"
      case '+' => "Char +"
      case _ => "not match"
    }

    //匹配类型
    def describeType(x: Any): String = x match {
      case i: Int => "Int" + i
      case s: String => "String" + s
      case c: Char => "Char" + c
      case list: List[Int] => "List[Int] " + list
      case list: List[String] => "List[String]" + list
      case arr: Array[Int] => "Array" + arr.mkString("-")
      case _ =>"Not match"
    }
    println(describeType(23))
    println(describeType("hello"))
    println(describeType(List("a","b","c")))
    println(describeType(List(1,2,3)))
    println(describeType(Array("a","b","c")))
    println(describeType(Array(1,2,3)))

    println("===========================")

    //匹配数组
    for (arr <- List(
      Array(0),
      Array(1, 0),
      Array(0, 1, 0),
      Array(1, 1, 0),
      Array(2, 3, 5, 78),
      Array("hello", "scala")
    )){
      val res = arr match {
        case Array(0) => "Array(0)"
        case Array(x,y) => "Array(2):" + x + " " + y
        case Array(1,_*) => "Array(): start with 0"
        case Array(_,1,_*) => "Array(): second 1"
        case _ => "else"
      }
      println(res)
    }
    //匹配列表
    for (list <- List(
      List(0),
      List(1, 0),
      List(0, 0, 0),
      List(1, 1, 0),
      List(88)
    )){
      val res = list match {
        case List(0) => "List(0)"
        case List(x, y) => "List(2): " + x + " " + y
        case List(_) => "List(1)"
        case _ => "else"
      }
      println(res)
    }
    println("================")



  }
}
