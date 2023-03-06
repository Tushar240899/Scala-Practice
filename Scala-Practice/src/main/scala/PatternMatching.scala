class MatchCase {

  def matchName(name: String): Unit = {

    name match {

      case "John" => println("Name is John")

      case "Stark" => println("Name is Stark ")

      case "Tushar Dhiman" => println("Name is Tushar Dhiman")

      case _ => println("name is not correct")
    }
  }


}

object PatternMatching extends App {

  private val matchCase_object = new MatchCase()

  matchCase_object.matchName("Tushar Dhiman")

}
