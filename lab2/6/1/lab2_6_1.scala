object Main22 {
  
def sumList(lst: List[Int]): Int = {

  if (lst.isEmpty) 0
  else lst.head*lst.head + sumList(lst.tail)

}

def main(args: Array[String]): Unit = {

  val myList = List(1, 2, 3, 4, 5)
  val sumw = sumList(myList)
  
  println(sumw)

}
}