import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Await, Future}
import scala.concurrent.duration.DurationInt

//class FutureExample {
//
//  def getFutureSuccessValue(number: Int): Future[Int] = Future.successful(number)
//
//  def getForYieldOperations(n: Future[Int], m: Future[Int], r: Future[Int], q: Future[Int]): Future[Int] = {
//    val asd = for {
//      nValue <- n
//      mValue <- m
//      rValue <- r
//      qValue <- q
//    } yield nValue + mValue + rValue + qValue
//
//    Thread.sleep(20000)
//    asd
//  }
//
//  def getFutureValue: Future[String] = Future("This is Future String")
//
//  def getMappedValues(number1: Future[Int], number2: Future[Int]): Future[Future[Int]] = {
//    number1.map { number1Value =>
//      number2.map { number2Value =>
//        number1Value + number2Value
//      }
//    }
//  }
//
//  def getFlatMappedValue(number1: Future[Int], number2: Future[Int]): Future[Int] = {
//    number1.flatMap { number1Value =>
//      number2.map { number2Value =>
//        number1Value + number2Value
//      }
//    }
//  }
//
//  def getFutureValues(number: Future[Int]): Unit = {
//    number.onComplete {
//      case Failure(exception) => throw new RuntimeException(exception.getMessage)
//      case Success(value) => value
//    }
//  }
//
//  def getAwaitedValues(number: Future[Int]): Int = {
//    Await.result(number, Duration.Inf)
//  }
//
//}

object FutureExample extends App {

  //  private val futureExample = new FutureExample
  //  println(futureExample.getFlatMappedValue(Future(2), Future(3)))
  //  val num = Future(4)
  //  val num1 = Future(5)
  //  val num2= Future(6)
  //  val num3 = Future(7)
  //  println(futureExample.getForYieldOperations(num, num1, num2, num3))
  //
//    val re = futureExample.getForYieldOperationsFlatMappedValue(num3, num)
//    Await.result(re, 4.seconds)
//
//  //  println(futureExample.getAwaitedValues(Future(8)))
//
//
//  val futures = Seq(Future {1 }, Future { 2 }, Future {3})
//  val futureSeq = Future.sequence(futures)
//
//  println(futureSeq)


}
