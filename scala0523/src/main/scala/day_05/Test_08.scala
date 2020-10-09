package day_05

object Test_08 {
  def main(args: Array[String]): Unit = {
    //基本情况
    val student:Student9 = new Student9
    println(student.name)
    student.hello()
    student.hi()

    println("============")

    //多态情况
    val student1:Person9 = new Student9
    println(student.name)   //属性和方法全部动态绑定
    student.hello()
    //student1.hi()   error
  }
}


//定义父类和子类
class Person9{
  val name: String = "Person"
  var age: Int = 18
  def hello(): Unit ={
    println("Hello from person")
  }
}

class Student9 extends Person9{
  override val name: String = "Student"
  age = 23

  override def hello(): Unit = {
    println("Hello from student")
  }

  def hi(): Unit ={
    println("hi from student")
  }

}
