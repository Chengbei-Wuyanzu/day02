package day_06
//不可变数组
object Test_01 {
  def main(args: Array[String]): Unit = {
    //1.创建数组
    //1.1直接new
    val arr1: Array[Int] = new Array[Int](5)
    println(arr1.mkString(","))

    //1.2用伴生对象
    val arr2 = Array(1,2,3,4,5)
    println(arr2.mkString(","))

    println("====================")

    //2.访问数组元素
    println(arr2(4))
    println(arr2.apply(3))

    arr1(4) = 5
    println(arr1(1))

    println("====================")

    //3.数组的遍历
    //3.1遍历下标
    for (i <- 0 until  arr2.length) println(arr2(i))

    println("============")
    for (i <- arr2.indices) println(arr2(i))

    println("============")

    //3.2直接遍历数组
    for (elem <- arr2) println(elem)

    println("============")

    //3.3迭代器
    val iter = arr2.iterator
    while (iter.hasNext)
      println(iter.next())

    println("============")

    //3.4调用foreach方法
    arr1.foreach((elem: Int) => println(elem))
    arr2.foreach(println)

    println("============")

    //4.用不可变数组实现添加数据
    //必须定义一个新的数组来接收返回值
    val newArr1 = arr1 :+ 6              //在数组末尾加上一个数据
    //val newArr1 = arr1.:+(6)   也可以这样写

    val newArr2 = arr1.+:(1)
    println(newArr2.mkString(","))

    val newArr3 = newArr1 :+ 7
    val newArr4 = 8 +: 9 +: newArr2
    println(newArr3.mkString(","))
    println(newArr4.mkString(","))

  }
}
