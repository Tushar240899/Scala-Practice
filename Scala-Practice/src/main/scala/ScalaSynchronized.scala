class SynchronizedBlock extends Thread {

  private var counter = 0
  private var i = 10

  override def run(): Unit = {
    synchronized {
      while (i >= 0) {
        counter += 1
        println(counter)
        i -= 1
      }
    }
  }
}

object ScalaLocks extends App {

  val synchronizedBlock = new SynchronizedBlock
  val synchronizedBlock2 = new SynchronizedBlock
  synchronizedBlock.start()
  synchronizedBlock2.start()
}
