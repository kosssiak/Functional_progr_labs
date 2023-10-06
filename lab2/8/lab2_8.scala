object Main22 {

def minList(lst: List[Int], minval: Int): Int = {

  if (lst.isEmpty) minval
  else  if (lst.head<minval)  minList(lst.tail,lst.head) 
  else minList(lst.tail,minval)

}

def main(args: Array[String]): Unit = {
 
  val myList = List(1, -2, 3, -7, -5)

  val minw = minList(myList,myList.head)
  println(minw)

}
}