class PartialFunctionExample {

  val divide: PartialFunction[Int, Int] ={
    case number: Int if number != 0 => 42 / number
  }
}

object temp extends App{

  private val partialFunctionExample = new PartialFunctionExample

  if (partialFunctionExample.divide.isDefinedAt(5)) {
    println(partialFunctionExample.divide.apply(5))
  }
}
