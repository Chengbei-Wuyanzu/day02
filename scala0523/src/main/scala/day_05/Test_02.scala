package day_05

object Test_02 {
}

class Person{
  private var idCard: String = "123456"
  protected var name: String = "Henry"
  private[day_05] var age: Int = 18
  var sex: String = "Man"

  def printInfo(): Unit={
    println("This is a Person")
    println(s"$idCard $age $sex $name")
  }
}
