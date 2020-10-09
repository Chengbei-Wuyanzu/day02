package day_07

object Test_03 {
  def main(args: Array[String]): Unit = {
    //简单版本
    val stringList = List(
      "Hello Scala Hbase kafka", "Hello Scala Hbase", "Hello Scala", "Hello"
    )

    //1.1按空格切分字符串，得到打散的word
    val wordList0 = stringList.map(str => str.split(" "))

    val wordList = stringList.flatMap(_.split(""))
    //println(wordList)

    //1.2按照单词自身作为key分组
    val wordToWordsMap: Map[String, List[String]] = wordList.groupBy(word=>word)

    //1.3对分组的word列表进行length统计，得到（word，count）
    val wordToCountMap: Map[String, Int] = wordToWordsMap.map(tuple=>(tuple._1, tuple._2.size))

    val sortList: List[(String, Int)] = wordToCountMap.toList.sortWith {
      (left, right) => {
        left._2 > right._2
      }
    }

    val resultList: List[(String, Int)] = sortList.take(3)
    println(resultList)

  }
}
