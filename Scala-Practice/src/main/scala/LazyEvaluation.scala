//object LazyEvaluation extends App {
//
//
//  lazy val myLazyValue = {
//    println("Initializing myLazyValue")
//    42
//  }
//
//  // No output yet, because myLazyValue hasn't been accessed
//  println("Before accessing myLazyValue")
//
//  // Output: Initializing myLazyValue
//  println(myLazyValue)
//
//  // Output: 42
//  println(myLazyValue)
//
//  // No output, because myLazyValue has already been initialized
//  println("After accessing myLazyValue")
//}
//
//
//

object main1 extends App{

  val divide: PartialFunction[Int, Int] = {
    case d: Int if d != 0 => 42 / d
  }

  if(divide.isDefinedAt(6)) {
    println(divide(5))
  }
}