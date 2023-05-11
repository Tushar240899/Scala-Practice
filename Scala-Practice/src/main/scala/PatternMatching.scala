////class MatchCase {
////
////  def matchName(name: String): Unit = {
////
////    name match {
////
////      case "John" => println("Name is John")
////
////      case "Stark" => println("Name is Stark ")
////
////      case "Tushar Dhiman" => println("Name is Tushar Dhiman")
////
////      case _ => println("name is not correct")
////    }
////  }
////
////
////}
////
////object PatternMatching extends App {
////
////  private val matchCase_object = new MatchCase()
////
////  matchCase_object.matchName("Tushar Dhiman")
////
////}
//
//
//case class Person(name: String, age: Int, dept: String) {
//
////  def apply(name: String, age: Int, dept: String): Person = new Person(name, age, dept)
//
//  def unapply(person: Person): Option[(String, Int, String)] = {
//
//    Some(person.name, person.age, person.dept)
//
//  }
//
//  def patternMatch(person: Person): String = {
//    person match {
//      case Person(name,age,dept) => s"$name is $age years old in $dept department"
//      case _ => "nil"
//    }
//  }
//
//}
//
//object PersonTest extends App {
//
//  val person1 = Person("Tushar",23,"Scala")
//  val person2 = Person("Stark",23,"Scala")
//
//  println(person1.patternMatch(person1))
//}
//
//
