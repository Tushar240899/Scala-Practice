import scala.annotation.tailrec

object PivotIndex extends App {


  def pivotIndex(originalNums: Array[Int]): Int = {

    @tailrec
    def helper(nums: Array[Int], index: Int): Int = {

      if (nums.slice(0, index).sum == nums.slice(index + 1, nums.length).sum) {
        index
      }else if (index > nums.length - 1) {
        -1
      } else
        helper(originalNums, index + 1)
    }

    helper(originalNums, 0)
  }

  println(pivotIndex(Array(2, 1, -1)))

}
