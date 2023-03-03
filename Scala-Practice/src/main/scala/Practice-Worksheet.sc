
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






