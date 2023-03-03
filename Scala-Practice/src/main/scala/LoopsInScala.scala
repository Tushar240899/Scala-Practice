

// PRACTICING DIFFERENT LOOPS BY PRINTING TABLE OF 2.

object LoopsInScala{

  def main(args:Array[String]): Unit = {

    var multiplier: Int = 0

    // while loop practice

//    while(multiplier <= 10){
//      println("2"+"*"+ multiplier + "=" + multiplier * 2)
//      multiplier = multiplier + 1

    // for loop using (to) keyword practice.

//    for(multiplier <- 1 to 10){
//      println("2"+"*"+ multiplier + "=" + multiplier * 2)
//    }

    // for loop using (by) keyword practice.

    for(multiplier <- 1 until 11){
      println("2"+"*"+ multiplier + "=" + multiplier * 2)
    }

  }
}

