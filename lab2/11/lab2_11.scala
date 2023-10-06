object Main22 {

def main(args: Array[String]): Unit = {

    val numbers = List(1, 2, 3, 4, 5)
    println(s"Начальный список: $numbers")

    val reversed = numbers.reverse // List(5, 4, 3, 2, 1)
    println(s"Перевёрнутый список: $reversed")

}
}