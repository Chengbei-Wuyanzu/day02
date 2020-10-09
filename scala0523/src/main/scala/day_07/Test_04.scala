package day_07

object Test_04 {
  def main(args: Array[String]): Unit = {
    val student = new Student("Alice",18)

    //对对象进行模式匹配
    val res = student match{
   //   case Student("Alice",18) => "Alice"
      case _ => "else"
    }
    println(res)
  }
}


class Student(val name: String,val age: Int)

//伴生对象
object Student{
  def apply(name: String, age: Int): Student = new Student(name, age)

 // def unapply(arg: Student): Option[(String, Int)]
}
