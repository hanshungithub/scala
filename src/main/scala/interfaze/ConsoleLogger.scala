package interfaze

class ConsoleLogger extends Logger {

  def log(msg: String): Unit = println(msg)

}
