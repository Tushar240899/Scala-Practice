import scala.annotation.tailrec

object HOFsCurries extends App {

@tailrec
private def nTimes(f: Int => Int, n: Int, x:Int): Int = {
  if(n <= 0) x
  else nTimes(f, n-1, f(x))
}

  // Functions with multiple parameters lists.
  private def curriedFormatter(c: String)(x: Double): String = c.format(x)

  private val standardFormat: (Double => String) = curriedFormatter("%.2f")
  private val preciseFormat: (Double => String) = curriedFormatter("%10.8f")

  println(standardFormat(Math.PI))
  println(preciseFormat(Math.PI))
}
