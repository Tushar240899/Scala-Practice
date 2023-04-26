object CaseClass extends App {

  final case class Person1(name: String, age: Int)
  case class Person(name: String, age: Int)
  val stark = Person("stark", 30)
  val steve = Person("steve", 30)

  val str = Person1("ASdad", 45)

  val str2 = str.copy("Asdasd")




//  println(stark.name)
//  println(stark == steve)
//  println(stark eq steve)
//  println(stark ne steve)


  println(stark.hashCode())
  println(steve.hashCode())
  println(steve.toString)


}
