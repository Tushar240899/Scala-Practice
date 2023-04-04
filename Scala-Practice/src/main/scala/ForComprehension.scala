import scala.util.Try

object ForComprehension extends App {


  val num1 = Try(10)
  val num2 = Try(3.4)
  val num3 = Try(6.78)
  val num4 = Try(35)

  val result: Try[Double] = for{      
    first <- num1
    second <- num2
    third <- num3
    four <- num4

  }yield first + second + third + four

println(result)
}
