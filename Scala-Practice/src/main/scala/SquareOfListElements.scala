case class SquareOfElements(userList: List[Int]) {

  // Function to square the elements of the list using map() function.
  def squaredListUsingMap(): List[Int] = {
    val newSquaredList = userList.map(element => element * element)
    newSquaredList
  }

  // Function to square the elements of the list using Pattern Matching.
   def squaredListUsingPatternMatching(list: List[Int]): List[Int] = {
    list match {
      case Nil => Nil
      case head :: tail => head * head :: squaredListUsingPatternMatching(tail)
    }
  }
}

object SquareOfListElements extends App{

  val squareOfElements = SquareOfElements(List(1,2,3,4,5))

  println(squareOfElements.squaredListUsingMap())
  println(squareOfElements.squaredListUsingPatternMatching(List(1,2,3,4,5)))

}