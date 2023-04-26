import scala.language.implicitConversions

object Implicits extends App{

  implicit def numberToString(number: Double): Int = number.toInt

  private def convert(number: Int): String = number.toString


  println(convert(3.12))
}
