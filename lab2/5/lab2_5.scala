object Main22 {
  
def main(args: Array[String]): Unit = {

  val a = List(1, 2, 3)
  val b = List("one", "two", "three")

  val zipped = a.zip(b) // List((1, "one"), (2, "two"), (3, "three"))
  println(zipped)

  val filteredList = zipped.filter { case (a, _) => a == 1 }
  println(filteredList)

  val tup=filteredList.head
  println(tup)
  
  val secondItem = tup._2
  println(secondItem)

}
}