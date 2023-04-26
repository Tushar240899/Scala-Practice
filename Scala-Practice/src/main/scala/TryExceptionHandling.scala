import scala.annotation.tailrec
import scala.util.{Failure, Success, Try}

class TryExceptionHandling {

  def factorial(number: Int): Any = Try {

    @tailrec
    def helper(number: Int, result: Int): Int = {
      if (number == 1) result
      else
        helper(number - 1, number * result)
    }

    helper(5, 1)
  }
  match {
    case Failure(exception) => exception
    case Success(value) => value
  }
}

object main extends App {

  private val tryExceptionHandling = new TryExceptionHandling()
  println(tryExceptionHandling.factorial(5))

}

// class MultithreadingDemo extends Runnable {
//        override def run(): Unit = {
//          try
//            // Displaying the thread that is running
//            System.out.println("Thread " + Thread.currentThread.getId + " is running")
//          catch {
//            case e: Exception =>
//
//              // Throwing an exception
//              System.out.println("Exception is caught")
//          }
//        }
//      }
//      class CallableDemo extends Callable[String] {
//        def call(): String = {"String"}
//      }
//
//    val executor = Executors.newFixedThreadPool(5)
//    executor.submit(new MultithreadingDemo)
//    executor.submit(new CallableDemo)

