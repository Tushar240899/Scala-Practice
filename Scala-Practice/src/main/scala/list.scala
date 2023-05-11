object list extends App{

  val list = List(1,2,3,4,5)

  val newList = list.drop(2)
  println(newList.dropRight(2))
  private val thirdElement = newList.dropRight(2)

  thirdElement.foreach{ element => println(element)}


  private val list2 = List(1,2,3,4,5)

  println(list2.filter(_ % 2 == 0))
  println(list2.filter(_ % 2 != 0))





}
