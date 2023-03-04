
class ThisKeywordExample {

  private var stud_id = 0
  private var stud_name = ""

  def this(stud_id: Int, stud_name: String) {

    this()
    this.stud_id = stud_id
    this.stud_name = stud_name

  }

  def display_info(): String = {

    stud_id + " " + stud_name
  }

}

object ThisKeyword extends App {

  private var thiskeywordexample_object = new ThisKeywordExample(1855, "Tushar Dhiman")

  println((thiskeywordexample_object.display_info()))


}
