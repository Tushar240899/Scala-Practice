object ConditionalExpressions{
  def main(args:Array[String]): Unit = {
    val result = check_Negative(-10)
    println(result)
  }
  def check_Negative(number:Int): Unit = {
    if(number < 0){
      println("Number is negative")
    }
    else if(number == 0){
      println("number is not negative nor positive")
    }
    else {
      println("Number is positive")

    }
  }
}
