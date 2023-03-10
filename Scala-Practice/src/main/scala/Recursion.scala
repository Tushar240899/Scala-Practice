object Recursion extends App{

  private def factorial(num: Int): Int = {

    if(num <= 0) 1

    else num * factorial(num-1)

  }

  println(factorial(5))
}
