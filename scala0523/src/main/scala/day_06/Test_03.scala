package day_06

object Test_03 {
  def main(args: Array[String]): Unit = {
    //1.创建一个多维数组
    val arr: Array[Array[Int]] = Array.ofDim[Int](2,3)

    //2.访问数组元素
    println(arr(0)(1))
    arr(0)(1) = 13
    println(arr(0)(1))

    println("================")

    //3.遍历数组
    for (i <- 0 until arr.length;j <- 0 until arr(i).length) println(arr(i)(j))
    println("================")

    for (i <- arr.indices;j <- arr(i).indices){
      print(arr(i)(j) + "\t")
      if (j == arr(i).length -1) println()
    }
    println("================")

    arr.foreach(line => line.foreach(println))
    arr.foreach( _.foreach(println))
  }
}
