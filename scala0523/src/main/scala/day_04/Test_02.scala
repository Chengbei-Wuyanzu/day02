package day_04

//函数高级用法的具体案例模拟map操作
object Test_02 {
  def main(args: Array[String]): Unit = {
    def arrayMap(arr: Array[Int],op: Int =>Int):Array[Int] = {
      for (elem <- arr) yield op(elem)
    }

    //定义具体的map操作
    def addOne(a: Int): Int = a + 2
    def mulTwo(a: Int): Int = a * 2
    val array = Array(1,2,3,4)
    val newarray = arrayMap(array,addOne)
    println(newarray.mkString(" "))
    //匿名函数
    println(arrayMap(array,a => a + 1))
    println(arrayMap(array,_ * 2))
  }
}
