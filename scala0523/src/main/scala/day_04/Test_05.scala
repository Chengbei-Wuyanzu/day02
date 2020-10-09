package day_04

import scala.annotation.tailrec

//递归:求阶乘
object Test_05 {
  def main(args: Array[String]): Unit = {
    println(fact(5))
    println(factorial(6))
    println(tailFactorial(10))
  }
  def fact(n: Int): Int={
    var result: Int = 1
    for(i <- 1 to n){
      result *= i
    }
    result
  }

  //递归实现
  def factorial(n: Int): Int={
    if(n == 0) return 1
    n * factorial(n - 1)
  }

  //尾递归:将递归调用作为代码的最后一步
  def tailFactorial(n: Int): Int ={
    @tailrec
    def loop(acc: Int,n: Int): Int ={
      if(n == 0) acc
      else loop(n * acc,n - 1)
    }
    loop(1 , n)
  }


}










