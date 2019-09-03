package akkas.t1

import akka.actor.Actor

class SayHelloActor extends Actor {
  override def receive: Receive = {
    case "hello" => println("收到hello，回应hello too")
    case "ok" => println("收到ok，回应ok too")
    case "exit" => {
      println("收到exit指令，推出系统")
      context.stop(self)
      context.system.terminate()
    }
    case _ => println("匹配不到")
  }
}
