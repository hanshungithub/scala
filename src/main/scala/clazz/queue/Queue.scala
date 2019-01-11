package clazz.queue

trait Queue[T] {
  def head: T
  def tail: Queue[T]
  def append(x:T): Queue[T]
}
