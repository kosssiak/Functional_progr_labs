object Main234 {

    def main(args: Array[String]): Unit = {
     
    println("Введите число:")

    try{
        val input = scala.io.StdIn.readLine()
        val input_str = input.toCharArray
        if (input_str.length == 0 || input_str.length > 10){
            throw new Exception("Введите корректно число длиной до 10 знаков включительно!")
        }
        println("Начальное число: " + input_str.mkString)

        for (i <- 1 until input_str.length by 2) {
            if (input_str(i) == '2') {
                input_str(i) = '1'
            }
        }

        println("Конечное число: " + input_str.mkString)
        } catch {
        case e: Exception => println(e.getMessage)
        }
    }
}