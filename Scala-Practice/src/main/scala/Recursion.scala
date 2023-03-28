object Recursion extends App{

  private def factorial(num: Int): Int = {

    if(num <= 0) 1

    else num * factorial(num-1)

  }

  private def fibonacci(num: Int): Int={

    if(num <= 1) num
    else
      fibonacci(num-1) + fibonacci(num-2)
  }

  println(factorial(5))
  println(fibonacci(8))



















}
