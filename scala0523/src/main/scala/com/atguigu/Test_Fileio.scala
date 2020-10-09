package com.atguigu

import java.io.{File, PrintWriter}

import scala.io.Source

object Test_Fileio {
  def main(args: Array[String]): Unit = {
    //1.从文件读取
    Source.fromFile("src/main/resources/test").foreach(
      print
    )
    //2.写入文件
    val writer = new PrintWriter(new File("src/main/resources/out"))
    writer.write("Hello scala")
    writer.close()
  }

}
