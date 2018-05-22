package helloworld

import akka.actor.{ActorSystem, Props}

object HelloAkkaScala extends App{
  val system = ActorSystem("Hello-Akka")

  val greeter = system.actorOf(Props[Greeter], "Greeter")

  greeter ! WhoToGreet("Victor")
}
