object HighOrderFunction {
  def main(args: Array[String]): Unit ={
    def result(num: Int, func: Int => AnyVal): Int = {
      multiply(num)
    }

    def multiply(num: Int): Int = {
      num * 10
    }

    println(result(20, multiply))
  }
}


