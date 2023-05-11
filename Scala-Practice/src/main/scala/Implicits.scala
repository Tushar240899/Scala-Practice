import scala.language.implicitConversions

// -------------------------------------- implicit conversion example ---------------------------------------------------------
case class Fahrenheit(value: Double)
case class Person(name: String, age: Int)

object Implicits extends App {

  implicit def celsiusToFahrenheit(fahrenheit: Fahrenheit): Double = {
    fahrenheit.value * 1.8 + 32
  }

  val fahrenheit = Fahrenheit(20)

  def printTemperature(temp: Double): Unit = {
    println(s"The temperature is $temp degrees Fahrenheit.")
  }
  printTemperature(fahrenheit)
}

// --------------------------------------- implicit parameter example ------------------------------------------------
object ImplicitParameter extends App {
  val person = Person("Tushar", 23)

  def greet(person: Person)(implicit greeting: String): String = {
    s"$greeting my name is ${person.name} age ${person.age} "
  }
  implicit val greetings: String = "hello"
  println(greet(person))
}

// ---------------------------implicit class example-------------------------------------------------


object ImplicitClass extends App {
  implicit class StringImprovement(val string: String) {
    def increment: String = string.map(char => (char + 1).toChar)
  }

  val string = "abcdefg"
  private val string2 = string.increment
  println(string2)

}