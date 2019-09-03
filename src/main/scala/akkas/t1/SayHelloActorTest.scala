package akkas.t1

import akka.actor.{ActorRef, ActorSystem, Props}

object SayHelloActorTest {

  private val actorfactory = ActorSystem("actorfactory")
  private val sayHelloActorRef: ActorRef = actorfactory.actorOf(Props[SayHelloActor],"sayHelloActor")

  def main(args: Array[String]): Unit = {
    sayHelloActorRef!"hello"
    sayHelloActorRef!"ok"
    sayHelloActorRef!"ok~"
    sayHelloActorRef!"exit"
  }
}
