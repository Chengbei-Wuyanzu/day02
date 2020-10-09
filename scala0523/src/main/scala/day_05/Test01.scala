package day_05

import scala.beans.BeanProperty

//
object Test01 {
  def main(args: Array[String]): Unit = {
    val student = new Student
    println(student.name)
    println(student.age)
    student.sex = "Girl"
    println(student.sex)
  }
}


//定义一个类
class Student{
  //定义属性
  var name: String = "Yangfan"
  @BeanProperty
  val age: Int = 18

  var sex: String = _

}