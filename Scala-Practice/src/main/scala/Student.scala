class Student{

  val id: Int = 1;
  val name: String = "Tushar";

}

object MainObject{
  def main(args:Array[String]): Unit = {
    val stud_object = new Student()
    println(stud_object.id+""+stud_object.name)
  }

}
