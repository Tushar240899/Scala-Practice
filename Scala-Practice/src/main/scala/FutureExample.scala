import scala.annotation.tailrec
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

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
  // println(futureExample.getAwaitedValues(Future(8)))
  //
  //  val futures = Seq(Future {1 }, Future { 2 }, Future {3})
  //  val futureSeq = Future.sequence(futures)
  //
  //  println(futureSeq)
  //
  //  val futureResult: Future[Int] = Future(10 / 0).recover {
  //    case _: ArithmeticException => 0
  //  }
  //  val futureResult1: Future[Int] = Future(10 / 0).recoverWith {
  //    case _: ArithmeticException => Future(10 / 1)
  //  }
  //
  //  println(futureResult)
  //  println(futureResult1)
  //
  //
  //  val future = Future(10 / 5)
  //
  //  future.onComplete {
  //    case Failure(exception) => throw new IllegalArgumentException()
  //    case Success(value) => futureAnswer(value)
  //  }
  //
  //  private def futureAnswer(value: Int): Unit = {
  //    println(value)
  //  }


  val ref: Future[List[List[String]]] = Future(List(List("Stark")))

  val reff: Future[String] = ref.map(_.flatten.mkString(","))

  println("List[String]", Await.result(reff, Duration.Inf))


  val ref2: List[Future[List[String]]] = List(Future(List("Stark")))

  // Future[List[String]]
  val ref3 = Future.sequence(ref2).map { element => element.flatten }
  println(Await.result(ref3, Duration.Inf))


  val ref4: Seq[Future[List[String]]] = Seq(Future(List("Stark")))
  // Seq[String]
  val reff4 = Await.result(Future.sequence(ref4).map {
    seqOfList =>
      seqOfList.flatMap {
        listOfString => listOfString
      }
  }, Duration.Inf)

  println(reff4)
  val result = Await.result(convertThis(List(List(Future(List((1, "asdasd")))))), 20.seconds)
  val string = "FiivveeF" // List(2,2,2,2,2,2,2,2)

  println(result)
  var listOfOccurence: List[Int] = List()

  def convertThis(list: List[List[Future[List[(Int, String)]]]]): Future[Int] = {

    val result = list.flatten
    val result1 = Future.sequence(result).map {
      list =>
        list.flatten.map {
          tuple => tuple._1
        }.sum
    }
    result1
  }

  string.foreach { char =>
    listOfOccurence = listOfOccurence :+ string.count(_ == char)

  }
  println(listOfOccurence)

}


