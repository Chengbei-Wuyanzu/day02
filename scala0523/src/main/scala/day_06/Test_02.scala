package day_06

import scala.collection.mutable.ArrayBuffer

//创建可变数组
object Test_02 {
  def main(args: Array[String]): Unit = {
    //1.创建可变数组
    val arr1: ArrayBuffer[Int] = new ArrayBuffer[Int]()
    val arr2 = ArrayBuffer(1,2,3)
    println(arr1)
    println(arr2)

    println("==========")

    //2.访问数组元素
    //println(arr1(3))            //确认arr1有值才可以进行访问
    println(arr2(2))

    arr2(2) = 4                   //改变arr2中的值
    println(arr2)
    arr2.update(1,3)              //改变arr2中下标为1的数
    println(arr2)

    //3.向数组添加元素    不建议
    val newArr1 = arr1 :+ 5
    val newArr2 = 0 +: arr2
    println(newArr1)
    println(newArr2)


    //调用带英文名称的方法
    arr1.append(6)
    arr2.append(5,6,7)

    arr1.prepend(4,5)
    arr2.prepend(0)

    arr1.insert(1,4)
    arr2.insert(2,2)

    println(arr1)
    println(arr2)

    arr1 += 9
    10 +=: arr1
    println(arr1)


    //4.删除数组元素
    arr1.remove(0)
    println(arr1)

    arr1.remove(3)
    println(arr1)

    //还可以用++=进行集合合并
    arr2 ++= ArrayBuffer(8,9,10)
    Array(0,0) ++=: arr2
    println(arr2)

    println("=============")


    //5.可变数组和不可变数组的转换
    //5.1可变转不可变
    val arr: ArrayBuffer[Int] = ArrayBuffer(1,2,3)
    val newArr: Array[Int] = arr.toArray

    //5.2不可变转可变
    val buffer = newArr.toBuffer
    println(buffer)

    val bArr = ArrayBuffer[Int]()
    bArr ++= newArr
    println(bArr)


  }
}
