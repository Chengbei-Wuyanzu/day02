package day_05

//抽象类
object Test_07 {
  def main(args: Array[String]): Unit = {
    val student = new Student8()
    student.sleep()
    student.eat()
  }
}


//定义抽象类
abstract class Person8{
  //非抽象属性
  val name: String = "Alice"
  //抽象属性
  var age: Int

  //非抽象方法
  def eat():Unit = {
    println("Person eat")
  }

  //抽象方法
  def sleep(): Unit
}

//定义实现的子类
class  Student8 extends Person8{
  //重写非抽象属性
  override val name: String = "Bob"
  override var age: Int = 19

  override def sleep(): Unit = {
    println(s"Student:$name sleep")
  }

  override def eat(): Unit = {
    println(s"Student:$name eat")
  }
}



