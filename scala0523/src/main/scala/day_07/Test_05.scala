package day_07

object Test_05 {
  def main(args: Array[String]): Unit = {
    val student = new Student1("Henry",19)
    val res = student match {
      case Student1("Henry",19) => "Henry 19"
      case _ => "else"

    }
      println(res)
  }
}

case class Student1(name: String,age: Int)
