import scala.::
import scala.collection.immutable.List
import scala.collection.mutable.ListBuffer

// mutable variable using var
var number = 100
number
number = 101

// immutable variable using val
val number2 = 1
number2

//number2 = 2

class Student {

  val id: Int = 1;
  val name: String = "Tushar";

}

object MainObject {
  def main(args: Array[String]): Unit = {
    val stud_object = new Student()
    println(stud_object.id + "" + stud_object.name)
  }

}

class Customer(firstName: String)

val customer = new Customer("Lupita")

//customer.firstName("asdasd")

3 == 3

new String("Scala") == new String("Scala")


var number1: Int = 23
var number2: Int = 22

if (number1 == number2) {

  println("Numbers are equal");
}
else {
  println("Numbers are not equal")
}


val vector = Vector(1, 2, 3)

val vector2 = Vector(4, 5, 6)

val set = Set(1, 2, 3)

val set1 = Set(4, 5, 6)

vector ++ vector2

set ++ set1

"Hello World".filter(char => List('a', 'e', 'i', 'o', 'u').contains(char))
"Hello World".filterNot(char => List('a', 'e', 'i', 'o', 'u').contains(char))

for {
  n <- 1 to 3
  m <- 1 to n
} yield n * m

for {
  n <- 1 to 3 if n % 2 == 1
  m <- 1 to n
} yield n * m


val doubler: Int => Int = (x: Int) => x *2
doubler(2)

val doubler: String => String = (x: String) => x*2
doubler("String")

val number = (x:Int) => x+x

number(4)

// name : (parameters type) => return type = parameters name and type => body/expression.
val number: (Int, Int) => String = (firstnumber: Int, secondNumber: Int)=> firstnumber*secondNumber+"abc"

number(2,3)

def greeting(name:String, age: Int): String = {
  s"Hi, my name is $name and I am $age years old"
}

greeting("Tushar",23)


// s interpolation
val name = s"my name is tushar\nhello world"

println("s interpolation example:---")

println(s"$name")
println(f"the number is ${2 + 9.54}%2.3f")

val num = "the number is \n ${2 * 9.5}%2.2f"
println(s"$num")

// f interpolation

val name = f"my name is tushar\nhello world"
println("f interpolation example:---")

println(f"$name")
println(f"the number is \n ${2 + 9}")

//raw interpolation
val name = "my name is tushar\nhello world"
println("raw interpolation example:---")


println(raw"$name")
println(raw"the number is \n ${2 + 9}")

//val number = 44
//
//val numberString = number match{
//
//  case 1 => "first"
//  case 2 => "Second"
//  case 3 =>  number + "th"
//  case _ => "anything"
//
//  println(numberString)
//}

val listPattern: List[List[Int]] = List(List(1,2,3,4,5))

def listFunc(listPattern: List[List[Int]]): List[Int]={
listPattern.flatMap {listOfString =>
  listOfString.map { elements =>
   elements
  }
} }

println(listFunc(listPattern))


val optionOfString: Option[List[Int]] = Some(List(1,2,3,4))

//def func(optionOfInt: Option[List[Int]]): List[Int]={
//optionOfInt.flatMap{list => list.map(
//  option => option * 2)
//}
//}
//println(func(optionOfString))


val patternOfOption: Option[Option[String]] = Some(Some("String1"))
//def optionPattern(patternOfOption: Option[Option[String]]): List[String]= {
//
//  patternOfOption.flatMap {
//    optionOfString =>
//      optionOfString.map(string => string)
//  }
//}
//println(optionPattern(patternOfOption))
//

val list = List(1,2,3,4,5)

println(list.filter(_ != 3))
println(list.filter(_ % 2 == 0))

list.head

val number = 10

val head :: tail = list

println(head , tail)

val url: String = "https://www.mywebsite.com/home"

println(url.substring(0, url.indexOf("://")))
println(url.substring(url.indexOf("://") + 3, url.indexOf("/", url.indexOf("://") + 3)))
println(url.substring(url.indexOf("/", url.indexOf("://")+3)+1))





