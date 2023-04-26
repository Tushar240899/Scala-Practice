object OptionExample extends App {

  val noOption: Option[Int] = None
  val result = Option(unsafeMethod())

  println(myFirstOption)
  private val myFirstOption: Option[Int] = Some(4)

  private def unsafeMethod(): String = null

  println(result)

  private def backupMethod(): String = "Valid Result"

  private val chainedResult = Option(unsafeMethod()).orElse(Option(backupMethod()))

  println(chainedResult)

}
