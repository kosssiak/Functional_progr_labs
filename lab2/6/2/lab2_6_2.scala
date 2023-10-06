object Main22 {

def main(args: Array[String]): Unit = {

  val myList = List(1, 2, 3, 4, 5)
  
  val sumOfSquares = myList.map(item => item * item).sum
  println(sumOfSquares) 

}
}