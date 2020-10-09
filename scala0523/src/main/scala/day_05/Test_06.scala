package day_05

object Test_06 {
  def main(args: Array[String]): Unit = {
    val student1 = new Student7("Alice",19,"guigu")
    student1.printInfo()

  }
}

//定义一个父类
class Person7(){
  println("父类的主构造器")

  var name: String = _
  var age: Int = _

  def this(name: String,age: Int){
    this()
    println("父类的辅助方法调用")
    this.name = name
    this.age = age
  }

  def printInfo(): Unit = {
    println(s"Person: $name $age")
  }
}

//定义子类
class Student7(name: String,age: Int) extends Person7{
  println("子类的主构造器")
  //多定义一个属性
  var school: String = _

  def this(name: String,age: Int,school: String){
    this(name,age)
    println("子类的辅助方法调用")
    this.school = school
  }
  override def printInfo(): Unit ={
    println(s"Student: $name $age $school")
  }
}



