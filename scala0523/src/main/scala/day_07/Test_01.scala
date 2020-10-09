package day_07

object Test_01 {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,3,4,5,6,7)
    val list2 = List(4,5,6,7,8,9,10,11,12)

    //1.获取集合的头
    println(list1.head)
    println(list2.head)

    //2.获取集合的尾
    println(list1.tail)
    println(list2.tail)

    //3.获取集合的最后一个数
    println(list1.last)
    println(list2.last)

    //4.获取集合初始数据（不包含最后一个）
    println(list1.init)
    println(list2.init)

    //5.反转
    println(list1.reverse)
    println(list2.reverse)

    //6.取前n或者后n个元素
    println(list1.take(3))
    println(list2.take(3))


    //7.去掉前后n个元素
    println(list1.drop(3))
    println(list2.drop(4))

    //8.并集
    println(list1.union(list2))

    //9.交集
    println(list1.intersect(list2))

    //10.差集
    println(list1.diff(list2))
    println("=======")
    //11.拉链 注:如果两个集合的元素个数不相等，那么会将同等数量的数据进行拉链，多余的数据省略不用
    println(list1.zip(list2))

    println("==============")
    //12.滑窗
    list1.sliding(2,5).foreach(println)
    list2.sliding(2,5).foreach(println)

  }
}
