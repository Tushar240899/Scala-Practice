
// mutable variable using var
var number = 100
number
number = 101

// immutable variable using val
val number2 = 1
number2

//number2 = 2

class Student{

  val id: Int = 1;
  val name: String = "Tushar";

}

  object MainObject{
    def main(args:Array[String]): Unit = {
      val stud_object = new Student()
      println(stud_object.id+""+stud_object.name)
    }

  }

class Customer(firstName: String)

val customer = new Customer("Lupita")

//customer.firstName("asdasd")

3==3

new String("Scala") == new String("Scala")




var number1: Int = 23
var number2: Int = 22

if(number1 == number2){

  println("Numbers are equal");
}
else{
  println("Numbers are not equal")
}


val vector = Vector(1,2,3)

val vector2 = Vector(4,5,6)

val set =  Set(1,2,3)

val set1 = Set(4,5,6)

vector ++ vector2

set ++ set1

"Hello World".filter(char => List('a','e','i','o','u').contains(char))
"Hello World".filterNot(char => List('a','e','i','o','u').contains(char))

for {
  n <- 1 to 3
  m <- 1 to n
} yield n*m

for {
  n <- 1 to 3 if n % 2 == 1
  m <- 1 to n
} yield n * m





