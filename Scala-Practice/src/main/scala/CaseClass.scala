object CaseClass extends App {

  case class Person(name: String, age: Int)
  val stark = Person("stark", 30)
  val steve = Person("steve", 30)

  println(stark.name)
  println(stark == steve)
  println(stark eq steve)
  println(stark ne steve)

}
