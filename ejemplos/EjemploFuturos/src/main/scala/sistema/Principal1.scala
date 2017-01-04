package sistema

import scala.concurrent.Future
import scala.concurrent.Await
import scala.concurrent.duration.DurationInt

object Principal1 extends App {
  import scala.concurrent.ExecutionContext.Implicits.global
  val simple = Future {
    Thread sleep (500)
    1 + 1
  }
  import scala.concurrent.duration._
  val resultado = Await.result(simple, 1 minute)
  println(s"El resultado es $resultado")  
} 
