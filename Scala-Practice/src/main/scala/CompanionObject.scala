class CompanionObject(val name: String, val age: Int)

object CompanionObject extends App{

  def apply(name: String) = new CompanionObject(name, 0)
  def apply(name: String, age: Int) = new CompanionObject(name, age)

  private val person1 = CompanionObject("Tushar")
  private val person2 = CompanionObject("Tushar", 23)

  println(person1.name)
  println(person2.age)
}
