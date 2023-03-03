

// PRACTICING DIFFERENT LOOPS BY PRINTING TABLE OF 2.

object LoopsInScala{

  def main(args:Array[String]): Unit = {

    var multiplier: Int = 0

    // !!!!!! WHILE LOOP PRACTICE !!!!!!

//    while(multiplier <= 10){
//      println("2"+"*"+ multiplier + "=" + multiplier * 2)
//      multiplier = multiplier + 1

    // !!!!!! FOR LOOP USING (to) KEYWORD PRACTICE. !!!!!!!

//    for(multiplier <- 1 to 10){
//      println("2"+"*"+ multiplier + "=" + multiplier * 2)
//    }

    // !!!!!!  FOR LOOP USING (by) KEYWORD PRACTICE.  !!!!!!!!

//    for(multiplier <- 1 until 11){
//      println("2"+"*"+ multiplier + "=" + multiplier * 2)
//    }

    // !!!!!  FOR LOOP USING FILTERING !!!!!!!

    for(multiplier <- 1 to 10 if multiplier % 2 == 0){

      println("2"+"*"+ multiplier + "=" + multiplier * 2)
    }
  }
}

