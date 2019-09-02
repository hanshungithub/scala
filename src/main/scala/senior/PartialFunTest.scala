package senior

object PartialFunTest {
  def main(args: Array[String]): Unit = {
    val list = List(1,2.3,4,"hello")
    val partialFun = new PartialFunction[Any,Int] {
      override def isDefinedAt(x: Any): Boolean = {
        print("item --->",x)
        x.isInstanceOf[Int]
      }

      override def apply(v1: Any): Int = {
        println("value ---> " + v1)
        v1.asInstanceOf[Int] + 1
      }
    }
  }
}
