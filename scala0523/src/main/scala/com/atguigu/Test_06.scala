package com.atguigu

import scala.io.StdIn

object Test_06 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 9){
      for(j <- 1 to i){
        print(j+"*"+i+"="+(i*j)+"\t")
      }
      println()
    }

    for (i <- 1 to 9) {
      for (j <- 1 to 9-i){
        print(" ")
      }
      for (j <- 1 to 2*i-1){
        print("*")
      }
      println()
    }
   for(i<- 1 to 9){
     println(" " * (9-i) + "*" * (2*i-1))
   }


  }
}
