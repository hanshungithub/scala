package method

object FunctionClass {
  // def 函数名(参数名:参数类型,参数名:参数类型): 返回类型 = {函数体}

  def shout(content:String): Unit = {
    println(content)
  }

  def sum(args:Int*): Int = {
    var result = 0
    for (arg <- args)
      result += arg
    result
  }

  def main(args: Array[String]): Unit = {
    //shout("hassan")
    println(sum(1,2,3))
  }
}
