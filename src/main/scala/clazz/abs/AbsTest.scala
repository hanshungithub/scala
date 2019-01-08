package clazz.abs

object AbsTest {

  def main(args: Array[String]): Unit = {
    val person = new Person {
      override def sayHello(): Unit = {
        println("abstract")
      }
    }
    person.sayHello()
  }


}
