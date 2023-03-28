class ApplyMethodClass {

  def apply(number: Int): Int = number*number
  def apply(number1: Int, number2: Int): Int = number1*number2

}

object ApplyMethod extends App{

  private val applyMethodClassObject = new ApplyMethodClass()

  println(applyMethodClassObject(2))
  println(applyMethodClassObject(2,3))
}
