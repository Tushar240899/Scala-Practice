import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, Future}

// mutable variable using var
var number = 100
number
number = 101

// immutable variable using val
val number2 = 1
number2

//number2 = 2

class Student {

  val id: Int = 1
  val name: String = "Tushar"

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


val doubler: Int => Int = (x: Int) => x * 2
doubler(2)

val doubler: String => String = (x: String) => x * 2
doubler("String")

val number = (x: Int) => x + x

number(4)

// name : (parameters type) => return type = parameters name and type => body/expression.
val number: (Int, Int) => String = (firstnumber: Int, secondNumber: Int) => firstnumber * secondNumber + "abc"

number(2, 3)

def greeting(name: String, age: Int): String = {
  s"Hi, my name is $name and I am $age years old"
}

greeting("Tushar", 23)


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

val listPattern: List[List[Int]] = List(List(1, 2, 3, 4, 5))

def listFunc(listPattern: List[List[Int]]): List[Int] = {
  listPattern.flatMap { listOfString =>
    listOfString.map { elements =>
      elements
    }
  }
}

println(listFunc(listPattern))


val optionOfString: Option[List[Int]] = Some(List(1, 2, 3, 4))

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

val list = List(1, 2, 3, 4, 5)

println(list.filter(_ != 3))
println(list.filter(_ % 2 == 0))

list.head

val number = 10

val head :: tail = list

println(head, tail)

val url: String = "https://www.mywebsite.com/home"

println(url.substring(0, url.indexOf("://")))
println(url.substring(url.indexOf("://") + 3, url.indexOf("/", url.indexOf("://") + 3)))
println(url.substring(url.indexOf("/", url.indexOf("://") + 3) + 1))


val num1: Option[Int] = Some(4)
val num2: Option[Int] = Some(6)
val num3: Option[Int] = Some(10)

val result = num1.flatMap { element1 =>
  num2.flatMap { element2 =>
    num3.map { element3 => element1 + element2 + element3 }
  }
}

println(result)


val list1 = List(1, 2, 3, 4, 5)
val list2 = List(1, 2, 3, 4, 5)
val list3 = List("a", "b", "c")

// On same list
list1 eq list2
list1 == list2
list1 equals list2



// On different List

list1 eq list3
list1 == list3
list1 equals list3

val list = List(1, 2, 3, 4, 5)

println(list.scan(1)((acc, a) => acc + a))

println(list.fold(0)((acc, x) => acc + x))

list.headOption

println(list.dropRight(1))
println(list.dropRight(3))

val set = Set(1, 2, 3, 4)
set(1)

try {
  4 / 0
}
catch {
  case e: Exception => e
}

val list: List[List[Int]] = List(List(1, 2, 3, 4), List(5, 6, 7, 8, 5))
list.flatten

val myList1 = List()

11 :: myList1
12 :: myList1

def convert(list: List[String]): Future[List[Int]] = {

  Future(list.map(string => string.length))
  //or
  //  Future(list.map(_.length))
}

println(convert(List("asd", "asdasd", "asdadasd")))

def convert2(list: List[Future[String]]): Future[List[Int]] = {

  Future.sequence(list).map { string => string.map(_.length) }

}

def capitalizeString(list: List[Future[String]]): Future[List[String]] = {

  Future.sequence(list).map(strings => strings.map(_.toUpperCase()))

}
val futures = List(Future("asd"), Future("asdasd"), Future("asdadasd"))
val result = Await.result(capitalizeString(futures), 20.seconds)


def checkLetter(list: List[Future[String]]): Future[List[Boolean]] = {

  Future.sequence(list).map(listOfStrings => listOfStrings.map(string => if (string.contains('a')) true else false))
}

val futures = List(Future("Tushar"), Future("steve"), Future("stark"), Future("bruce"))
Await.result(checkLetter(futures), 20.seconds)

def reverseString(list: List[Future[String]]): Future[List[String]] = {

  Future.sequence(list).map(listOfStrings => listOfStrings.map(_.reverse))
}

val futures = List(Future("Tushar"), Future("steve"), Future("stark"), Future("bruce"))
Await.result(reverseString(futures), 20.seconds)

def pairedWithLength(list: List[Future[String]]): Future[List[(String, Int)]] = {

  Future.sequence(list).map(listOfStrings => listOfStrings.map(strings => (strings, strings.length)))
}

val futures = List(Future("Tushar"), Future("steve"), Future("stark"), Future("bruce"))
Await.result(pairedWithLength(futures), 20.seconds)


val future = Future(9 / 3)

Await.result(future, 20.seconds)
Await.ready(future, 20.seconds)

//future.recover()


def listOfListOfListString(list: List[List[List[String]]]): List[Future[List[(String, Int)]]] = {

  List(Future {
    list.flatMap {
      listOfListOfString =>
        listOfListOfString.flatMap {
          listOfString =>
            listOfString.map(string => (string, string.length))
        }
    }
  }
  )
}
listOfListOfListString(List(List(List("Tushar", "Steve", "Stark", "Bruce"))))


def listOfListOfFutureOfListString(list: List[Future[String]]): List[Future[List[String]]] = {

  List(Future.sequence(list))

}

def sumOfAllIntegers(list: List[List[Int]]): Int = {

  list.flatMap {
    listOfIntegers => listOfIntegers
  }.fold(0)(_ + _)

}

sumOfAllIntegers(List(List(1, 2, 3, 4, 5)))


def removeDuplicatesAndSort(list: List[List[String]]): List[String] = {

  list.flatMap(listOfString => listOfString.distinct.sorted)
}

removeDuplicatesAndSort(List(List("Tushar", "Tushar", "Stark", "Steve", "Bruce")))

def sumOfTupleInteger(list: List[List[(Int, Int)]]): Int = {

  list.flatMap(listOfTuple => listOfTuple.map(_._1)).sum
}

sumOfTupleInteger(List(
  List((1, 2), (3, 4)),
  List((5, 6), (7, 8)),
  List((9, 10), (11, 12))
))