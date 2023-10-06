object Main22 {

  def isUnsorted(list: List[Int]): Boolean = {
    val isAscending = list.zip(list.tail).map { case (x, y) => x <= y }.forall(_ == true)
    val isDescending = list.zip(list.tail).map { case (x, y) => x >= y }.forall(_ == true)
    !isAscending && !isDescending
  }

  def main(args: Array[String]): Unit = {

    val myList = List(3, -5, 6, 33, 102, 4)
    val unsorted = isUnsorted(myList)
    if (unsorted) {
      println("Список не упорядочен ни по возрастанию, ни по убыванию.")
    } else {
      println("Список упорядочен по возрастанию или по убыванию.")
    }
  }
}
