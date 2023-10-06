object Main22 {

def isEven(x: Int): Boolean = x % 2 == 0
 
def main(args: Array[String]): Unit = {

    val myList = List(1, 2, 3, 4, 5)
    val filteredList = myList.filter(isEven)

    println(filteredList.mkString(", ")) // Output: List(2, 4)
    
}
}