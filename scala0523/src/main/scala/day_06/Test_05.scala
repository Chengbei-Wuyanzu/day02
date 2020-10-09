package day_06

import scala.collection.mutable.ListBuffer

object Test_05 {
  def main(args: Array[String]): Unit = {
    //创建可变list
    val list1: ListBuffer[Int] = new ListBuffer[Int]()
    val list2 = ListBuffer(1,2,3)

    //2.添加数据
    list1.append(2)
    list2.append(4,5)
    list1.prepend(0,1)

    list1 += 3 += 4
    0 +=: list2
    println(list1)
    println(list2)

    println("===============")

    //3.合并List
    val list3 = list1 ++ list2
    list1 ++= list2
    list1 ++=: list2
    println(list1)
    println(list2)
    println(list3)

    println("===============")

    //4.修改元素
    list3(2) = 1
    list3.update(1,0)
    println(list3)

    println("===============")

    //5.删除元素
    list3.remove(6,2)
    val list4 = list3 - 5
    println(list3)

  }
}
