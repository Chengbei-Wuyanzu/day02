package day_05

object Test_09 {
  def main(args: Array[String]): Unit = {
    val student = new Person10 {
      var name: String = "Henry"
      def eat(): Unit = println(s"Student: $name eat")
    }
    student.eat()
  }
}


//定义一个抽象类
abstract class Person10{
  var name: String
  def eat(): Unit
}