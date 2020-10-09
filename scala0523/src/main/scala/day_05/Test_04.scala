package day_05

//构造器
object Test_04 {
  def main(args: Array[String]): Unit = {
    val student1 =new Student1()
   // student1.Student1()

    val student2 = new Student1("Alice")
    val student3 = new Student1("Bob",23)
  }
}


//定义一个类
class Student1{
  println("Student1的主构造器被调用")
  //定义属性
  var name: String = _
  var age: Int = _

  println(s"$name $age")

  //定义辅助构造器
  def this(name: String){
    //直接调用主构造方法
    this()
    println("Student1的辅助构造器1被调用")
    this.name = name
    println(s"$name $age")
  }

  def this(name: String,age: Int) {
    //间接调用主构造方法
    this(name)
    println("Student1的辅助构造器2被调用")
    this.age = age
    println(s"$name $age")

  }

  def Student1(): Unit={
    println("Student1的一般方法被调用")
  }



}