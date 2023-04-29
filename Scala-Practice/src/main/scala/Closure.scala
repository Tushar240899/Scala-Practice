
object Closure extends App {

  private def operation(factor: Int) = (num: Int) => num * factor

  val doubler = operation(2)
  val tripler = operation(3)

  println(doubler(10))
  println(tripler(10))
}
