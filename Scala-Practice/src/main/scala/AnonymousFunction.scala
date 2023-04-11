object AnonymousFunction extends App{

  // anonymous function lambda
  val doubler: Int => Int = (number: Int) => number * 2
  println("lambda function: " + doubler(5))

  // multiple parameters in a Lambda
  private val adder: (Int,Int) => Int = (number1: Int, number2: Int) => number1 + number2
  println("multiple parameters lambda" + adder(3,5))

  //no parameters
  private val justDoSomething: () => Int = () => 4
  println(justDoSomething)
  println(justDoSomething())

  // curly braces with lambdas
  val stringToInt = { (str: String) => str.toInt }

  // MOAR Syntactic Sugar
  val niceIncrementer: Int => Int = _ + 1 // equivalent to x => x + 1
  val niceAdder: (Int, Int) => Int = _ + _ // equivalent to (x, y) => x + y

  // Lambda Function on list using map
  private val myList: List[Int] = List(4,3,1,5,6,7,98,0)
  println(myList.map{ _ * 2})

  // curried function lambda expression.
  private val superAdd = (num1: Int) => (num2: Int) => num1 + num2
  println(superAdd(4)(5))


}
