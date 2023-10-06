object Main22 {

  def sumLastThreeElements(list: List[Int]): Int = {
    list match {
      case Nil => 0 
      case _ :: tail if tail.length >= 3 => sumLastThreeElements(tail) 
      case head :: tail => head + sumLastThreeElements(tail) 
    }
  }

  def main(args: Array[String]): Unit = {
    val myList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val lastThreeSum = sumLastThreeElements(myList)

    println(s"Сумма последних трех элементов списка: $lastThreeSum")
  }
}
