object Sequences extends App {

  // Seq
  private val aSequence = Seq(1, 4, 2, 3)
  println(aSequence)
  println(aSequence.reverse)
  println(aSequence(3))
  println(aSequence ++ Seq(5, 6, 7))
  println(aSequence.sorted)

  // Ranges
  private val aRange: Seq[Int] = 1 to 10
  aRange.foreach(println)

  (1 to 10).foreach(something => println("Tushar"))

  // Lists

  private val aList = List(1,2,3)
  private val prepend = 42 :: aList
  private val append =  aList :+ 82
  println(prepend)
  println(append)

  private val apples5 = List.fill(5)("apple")
  println(apples5)
  println(aList.mkString("-"))

  // Arrays
  val numbers = Array(1,2,3,4)
  private val treeElements = Array.ofDim[Int](3)
  println(treeElements)
  treeElements.foreach(println)

  // mutation
  numbers(2) = 0
  println(numbers.mkString(" "))

  private val numberSeq: Seq[Int] = numbers  // implicit conversion
  println(numberSeq)

  val vector: Vector[Int] = Vector(1, 2, 3)
  println(vector)
  
}
