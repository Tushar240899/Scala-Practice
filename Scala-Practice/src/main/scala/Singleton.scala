object SingletonObject{
  def hello(): Unit = {
    println("calling the hello function")
  }
}


object Singleton{

  def main(args:Array[String]): Unit = {
    SingletonObject.hello()


  }
}

