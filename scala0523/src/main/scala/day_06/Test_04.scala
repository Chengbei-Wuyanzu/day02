package day_06

object Test_04 {
  def main(args: Array[String]): Unit = {
    //创建list
    val list1: List[Int] = List(1,2,3,4,5)
    println(list1)

    println("===============")

    //2.访问list元素  遍历方法
    for (elem <- list1) println(elem)

    println("===============")

    //3.向列表里添加数据
    val list2 = 0 +: list1
    val list3 = list2 :+ 6
    println(list1)
    println(list2)
    println(list3)

    println("===============")

    //4.特殊的list，用它来构建列表
    val list4 = list1.::(0)
    val list5 = Nil.::(12)
    println(list4)
    println(list5)

    val list6 = 11 :: list5
    val list7 = 15 :: 16 :: 17 :: Nil
    println(list6)
    println(list7)

    println("==============")

    //5.扁平化
    val list8 :List[Any] = list6 :: list7
    println(list8)

    val list9: List[Int] = list6 ::: list7
    println(list9)

  }
}
