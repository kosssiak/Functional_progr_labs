object Main22 {

  def sumNegativeElements(list: List[Int]): Int = {
    list match {
      case Nil => 0 
      case head :: tail if head >= 0 => sumNegativeElements(tail)
      case head :: tail if head < 0 => head + sumNegativeElements(tail)
    }
  }

  def main(args: Array[String]): Unit = {
    val myList = List(1, -2, 3, -4, 5, -6)
    val negativeSum = sumNegativeElements(myList)

    println(s"Сумма отрицательных элементов списка: $negativeSum")
  }
}

