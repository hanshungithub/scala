package `implicit`.t1

/**
  * 隐式函数 是以implicit关键字为声明的带有单个参数的的函数，这种函数将会自动应用，将值从一种类型转换到另一种类型
  */
object ImplicitTest {

  def main(args: Array[String]): Unit = {

    implicit def f1(d:Double):Int={
      d.toInt
    }

    val num:Int=3.5
    println("num =" + num)
  }
}
