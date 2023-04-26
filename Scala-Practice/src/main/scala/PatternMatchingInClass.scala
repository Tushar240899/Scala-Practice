class PatternMatchingInClass(val name: String, val age: Int)

object PatternMatchingInClass extends App{

  def unapply(person: PatternMatchingInClass): Option[(String, Int)] ={

    Some((person.name, person.age))

  }
  private val patternMatchingInClass = new PatternMatchingInClass("Tushar", 23)
  patternMatchingInClass match {
    case PatternMatchingInClass(name, age) => println(s"name is $name and age is $age")
    case _ => println("unknown person")
  }
}