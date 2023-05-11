import scala.annotation.tailrec

object RunningSum {

  def runningSum(nums: Array[Int]): Array[Int] = {

    val list = nums.toList

    @tailrec
    def helper(list: List[Int], sum: Int, newList: Array[Int]): Array[Int] = {

      list match {
        //case ::(head, Nil) => List(head)
        case ::(head, tail) => helper(tail, sum + head, newList :+ sum + head)
        case Nil => newList

      }
    }

    helper(list, 0, Array())

  }

  println(runningSum(Array(1, 2, 3, 4)).mkString(","))


}
