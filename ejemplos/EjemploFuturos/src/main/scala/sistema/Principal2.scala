package sistema

import scala.concurrent.Future
import scala.concurrent.Await
import scala.concurrent.duration.DurationInt
import scala.util.Success
import scala.util.Failure
import scala.util.Random

object Principal2 extends App {
  import scala.concurrent.ExecutionContext.Implicits.global
  val simple = Future {
//    if (Random.nextInt(500) < 250) throw new Exception("Oops")
    Thread sleep (500)
    1 + 1
  }
  println("Antes de llamar a onComplete")
  simple.onComplete {
    case Success(numero) => println(s"El resultado es $numero")
    case Failure(ex)     => println(s"Error: $ex")
  }
  dormir(100)
  dormir(100)
  dormir(100)
  dormir(100)
  dormir(100)
} 
