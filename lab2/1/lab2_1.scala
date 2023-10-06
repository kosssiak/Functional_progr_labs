object Main22 {

def double(x: Int): Int = x * 2

def main(args: Array[String]): Unit = {

    val myList = List(1, 2, 3, 4, 5)
    val doubledList = myList.map(double)

    println(doubledList) // Output: List(2, 4, 6, 8, 10)
    
}
}