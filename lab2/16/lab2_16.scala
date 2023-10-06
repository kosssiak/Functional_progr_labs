object Main22 {

  def checkForThreeIdenticalElements(list: List[Int]): Option[Int] = {
    val elementCountMap = list.groupBy(identity).mapValues(_.size)
    val result = elementCountMap.find { case (_, count) => count >= 3 }
    result.map { case (element, _) => element }
  }

  def main(args: Array[String]): Unit = {

    val myList = List(1, 3, 3, 3, 4, 5, 3, 6, 7, 4, 8)
    val result = checkForThreeIdenticalElements(myList)

    result match {
      case Some(element) => println(s"В списке есть три одинаковых элемента: $element")
      case None => println("В списке нет трех одинаковых элементов.")
    }
  }
}
