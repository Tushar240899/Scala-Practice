object MapFlatMapFilterFor extends App {

  val list = List(1, 2, 3)
  println(list)
  println(list.head)
  println(list.tail)

  // map
  println(list.map(_ + 1))
  println(list.map(_ + "is a number"))

  // filter
  println(list.filter(_ % 2 == 0))
  private val toPair = (x: Int) => List(x, x + 1)
  println(list.flatMap(toPair))

  // print all combination between two lists.
  private val numbers = List(1, 2, 3, 4)
  private val chars = List('a', 'b', 'c', 'd')
  private val colors = List("Red", "Blue")

  //List of ("a1","a2"....,"d4")
  println(numbers.flatMap(numberElements =>
    chars.flatMap(charElement => colors.map(colorElement => charElement + numberElements.toString + "-"
      + colorElement))))

  // foreach
  list.foreach(println)

  // for-comprehension
  private val forCombinations = for {
    numberElements <- numbers if numberElements % 2 == 0
    charElement <- chars
    colorElement <- colors
  } yield charElement + numberElements.toString + "-" + colorElement
  println(forCombinations)
}
