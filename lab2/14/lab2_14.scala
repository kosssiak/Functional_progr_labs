object Main22 {

  def findMaxElementIndex(list: List[Int], max: Int, currentIndex: Int, indexes: List[Int]): List[Int] = {
    list match {
      case Nil => indexes 
      case head :: tail =>
        if (head > max) {
          findMaxElementIndex(tail, head, currentIndex + 1, List(currentIndex))
        } else if (head == max) {
          findMaxElementIndex(tail, max, currentIndex + 1, indexes :+ currentIndex)
        } else {
          findMaxElementIndex(tail, max, currentIndex + 1, indexes)
        }
    }
  }

  def main(args: Array[String]): Unit = {
    val myList = List(1, 8, 5, 2, 5, 8, 5, 4)
    val maxElement = myList.max 
    val indexes = findMaxElementIndex(myList, maxElement, 0, List())
    val resultString = indexes.mkString(", ")
    println(s"Индексы всех максимальных элементов: $resultString")
  }
}
