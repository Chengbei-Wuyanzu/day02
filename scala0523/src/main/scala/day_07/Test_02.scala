package day_07

object Test_02 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5,6,7,8,9)

    //1.过滤
    //筛选所有的偶数
    val newList = for (i <- list if  i % 2 == 0) yield i
    println(newList)

    val evenList = list.filter(i => i % 2 ==0)
    println(evenList)

    //2.map
    val mapList = list.map(x => x * 2 + " data")
    println(mapList)

    //3.扁平化
    val nestedList = List(List(1, 2, 4),List(3,7,9),List(12,23,45))
    val flatList = nestedList.flatten
    println(flatList)

    //4.扁平化+映射
    val wordList: List[String] = List("hello world", "hello atguigu", "hello scala")
    println(wordList.flatMap(x => x.split(" ")))

    //5.分组
    println(list.groupBy(x => x % 2))


  }
}
