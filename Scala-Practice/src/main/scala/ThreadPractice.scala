class ThreadPractice extends Thread{
  override def run(): Unit = println("Thread is running")
}

object RunThread extends App {
  private val threadPractice = new ThreadPractice
  threadPractice.start()
}

class RunnableImplementation extends Runnable{
  override def run(): Unit = println("Thread is running...")
}

object RunnableThread extends App{
  private val runnableImplementation = new RunnableImplementation
  private val runnableThread = new Thread(runnableImplementation)
  runnableThread.start()
}