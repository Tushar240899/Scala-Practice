
class AddNumbers {

  def add(num1: Int, num2: Int): Int = {
      var result = num1 + num2;
      result
  }

  def add(num1: Int, num2: Int, num3: Int): Int= {
      var result = num1+ num2+ num3
      result
  }

}


object MethodOverloading extends App{

  private var addNumbers_object = new AddNumbers()
  println("The sum of two numbers are :- "+ addNumbers_object.add(10,12))
  println("The sum of three numbers are :- "+ addNumbers_object.add(10,43,56))

}
