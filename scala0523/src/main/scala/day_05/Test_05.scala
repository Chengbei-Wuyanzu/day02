package day_05

object Test_05 {
  def main(args: Array[String]): Unit = {
    val student3 = new Student3("Alice",18)
    student3.age = 10

    val student4 = new Student4("Bob",2)

    val student5 = new Student5("Henry",11)

    println("=============")
    val student6 = new Student6("Li",14,"atguigu")
    student6.printInfo()

  }
}


//定义类
class Student2{
  var name: String = _
  var age: Int = _
}

//主构造器有参数
//不建议
//class Student3(name0: String,age0: Int){
//  var name: String = name
//  var age: Int = 23
//}
class Student3(var name: String,var age: Int)

class Student4(val name: String,val age: Int)

class Student5(name: String,age: Int)

//同时提供有参数的主，辅构造器
class Student6(var name: String,var age: Int){
  //定义附加的属性
  var school: String = _
  def this(name: String,age: Int,school: String){
    this(name,age)
    this.school = school
  }

  //打印信息
  def printInfo(): Unit = {
    println(s"$age $name $school")
  }
}