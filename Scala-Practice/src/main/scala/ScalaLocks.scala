import java.util.concurrent.locks.ReentrantLock

class ScalaLocks extends Thread{

  private var counter = 0
  private var i = 10
  private val lock = new ReentrantLock()

  override def run(): Unit = {

    lock.lock()
    while(i >= 0){
      counter += 1
      println(counter)
      i -= 1
    }
    lock.unlock()
  }
}
object ScalaLocks extends App {

  private val scalaLocks = new ScalaLocks
  private val scalaLocks2 = new ScalaLocks
  scalaLocks.start()
  scalaLocks2.start()
}
