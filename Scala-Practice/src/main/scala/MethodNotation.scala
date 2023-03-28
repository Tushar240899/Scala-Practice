

object MethodNotation extends App {

  class Person(name: String, favoriteMovie: String){

    def likes(movie: String): Boolean = movie == favoriteMovie
    def unary_! : String = s"$name, What the heck!"

  }

  val stark = new Person("Stark", "Interstellar")
  println(stark.likes("Interstellar"))
  println(stark likes "Interstellar")

  //unary_prefix only works with  - + ~ !
  println(!stark)
  println(stark.unary_!)
}
