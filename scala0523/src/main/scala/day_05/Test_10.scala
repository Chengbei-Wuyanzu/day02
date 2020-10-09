package day_05

object Test_10 {
  def main(args: Array[String]): Unit = {
    //1.创建对象的基本方式
    // val student = new Student11("alice",18)
    // student.printInfo()

    //2.直接利用伴生对象创建类的实例
    val student:Student11 = Student11.apply()
    student.printInfo()

    val student1 = Student11.apply("Alice",18)
    student1.printInfo()
    println(Student11.school)

  }
}


//定义类,构造方法私有化
class Student11 private{
  var name: String = _
  var age: Int = _

  private def this(name: String,age: Int){
    this()
    this.name = name
    this.age = age
  }
  def printInfo(): Unit ={
    println(s"Student: $name $age")
  }
}

//定义伴生对象
object Student11{

  val school: String = "atguigu"

  //默认的apply方法，调用无参构造器
  def apply(): Student11 = new Student11()

  //apply方法重载
  def apply(name: String, age: Int): Student11 = new Student11(name, age)
}


