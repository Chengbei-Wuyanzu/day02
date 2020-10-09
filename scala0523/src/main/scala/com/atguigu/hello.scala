package com.atguigu

import scala.io.StdIn

object hello {
    def main(args: Array[String]): Unit = {
        println("Hello,World!")
        val stu1 = new student()
        student.school
        stu1.name = "lisi"
        stu1.age = 20
        println(student.school,stu1.name,stu1.age)

        val stu2 = new student()
        student.school
        stu2.name = "wangwu"
        stu2.age = 22
        println(student.school,stu2.name,stu2.age)
    }
}

class student{
    var age:Int = 0
    var name:String = ""
}
object student{
    val school:String = "atguigu"
}


