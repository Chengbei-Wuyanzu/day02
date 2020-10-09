package day_05

import java.awt.GridBagLayout

object Test_03 {
  def main(args: Array[String]): Unit = {
    val person = new Person
    println(person.age)
    println(person.sex)
    person.printInfo()

    val worker = new Worker
    worker.printInfo()
  }
}

class Worker extends Person{
  override def printInfo(): Unit ={
    println("This is a Worker")

    //获取父类的属性(私有成员是不能访问的)
    name = "Bob"
    age = 20
    sex = "Girl"

    super.printInfo()
  }
}
