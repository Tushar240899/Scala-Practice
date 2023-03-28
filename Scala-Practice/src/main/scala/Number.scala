case class Number(string: String, isEven: Boolean) {

}

object Case extends App{

  private val numbers: List[Number] = List(Number("1", isEven = false), Number("2",isEven = true),Number("3", isEven = false), Number("4",isEven = true), Number("5",isEven = false))

  // Implementation of .filter and .filterNot method
  private val evenList  = numbers.filter(num => num.isEven)
  private val oddList  = numbers.filterNot(num => num.isEven)
  println("EvenList = "+evenList)
  println("OddList = "+oddList)

  // Implementation of .partition method
  private val (evenPartition,oddPartition) = numbers.partition(num => num.isEven)
  println("EvenPartition = "+ evenPartition)
  println("OddPartition = "+ oddPartition)

  // Printing only 1st field of the case class for even numbers

  private val newList = evenList.map(firstField => firstField.string)
  println("1st field of the case class for even numbers = " + newList)

}