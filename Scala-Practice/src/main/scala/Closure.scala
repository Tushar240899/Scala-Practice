
object Closure extends App {

  private def multiplyBy(factor: Int) = (num: Int) => num * factor

  val doubler = multiplyBy(20)
  val tripler = multiplyBy(30)

  println(doubler(2))
  println(tripler(3))
}
