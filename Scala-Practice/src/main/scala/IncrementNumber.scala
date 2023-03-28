object IncrementNumber extends App {

    private def increment(number: Int, incrementingNumber: Int): Int = {
      number + incrementingNumber
    }

    println("Enter the number")
    private val number = scala.io.StdIn.readInt()
    println("Enter the number by which you want to increment the value")
    private val incrementingNumber = scala.io.StdIn.readInt()

    println(increment(number, incrementingNumber))
}
