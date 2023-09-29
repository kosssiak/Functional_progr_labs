object Main234 {

def processNumber(z: Int): String = {

  val numberStr: String = z.toString

  if (z < 0) {
    //println(z)
    if (numberStr.length > 0) {

      val modifiedStr = numberStr.replaceFirst("1", "0")
      val finalStr = modifiedStr.replace("-", "")
      //print(finalStr)
      if (finalStr.length < 10) {
        val paddedStr: String = "0" * (10 - finalStr.length) + finalStr
        return paddedStr
      }
      return finalStr
    }
  }
  return numberStr
}

def substringFromSymbolsAtEvenPositions(str: String): String = {
  val result = new StringBuilder
  for (i <- str.indices if i % 2 == 1) {
    result.append(str(i))
  }
  result.toString()
}

def substringFromSymbolsAtOddPositions(str: String): String = {
  val result = new StringBuilder
  for (i <- str.indices if i % 2 == 0) {
    result.append(str(i))
  }
  result.toString()
}

  def main(args: Array[String]): Unit = {
   print("Enter the number: ")
   
   var numberString : String =""
   var a=0
   var b=0
   var c=0
   var rez: Float =0.0
   var z=0
   numberString = scala.io.StdIn.readLine()
    if ((numberString.length() != 10)) {
     println("Incorrect number");
     sys.exit(0)  }

    for (i <- 1 to 5) {

    a=substringFromSymbolsAtEvenPositions(numberString).toInt
    b=substringFromSymbolsAtOddPositions(numberString).toInt
    c=a*b
    c=processNumber(c).toInt
    rez=c.toString().substring(0,3).toFloat / 1000
    z+=c
    z=processNumber(z).toInt
    println("\na=" + a);
    println("b=" + b);
    println("c=" + c);
    println("rez=" + rez); 
    println("z="+ z)
    numberString=processNumber(z)
    
}
}
}