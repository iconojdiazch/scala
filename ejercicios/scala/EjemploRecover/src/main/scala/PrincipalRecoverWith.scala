import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}
import scala.util.{Failure, Success}

/**
  * Created by usuario on 25/01/2017.
  */
object PrincipalRecoverWith extends App {

  val parcial: PartialFunction[Throwable, Future[Int]] = {
    case e: IllegalArgumentException => Future.failed(e)
  }
  val testOk: Future[Int] = test(1) recoverWith parcial
  val r1: Int = Await.result(testOk, 30 seconds)
  println(s"En r1 El resultado es $r1")
  
  val testMal: Future[Int] = test(0) recoverWith parcial fallbackTo (Future(0))
  val r2: Int = Await.result(testMal, 30 seconds)
  println(s"En r2 El resultado es $r2")

  // onComplete no es bloqueante, por lo que puede ocurrir que el programa termine 
  // antes de que los println se ejecuten
  val testMal1: Unit = test(0) recoverWith parcial onComplete {
    case Success(n) => println(s"En testMal1 El resultado es $n")
    case Failure(ex) => println(s"En testMal1 Ha ocurrido un error: ${ex getMessage}")
  }

  val f1: Future[Int] = Future(0)
  val f2 = f1 andThen {
    case Success(v) =>
      Thread.sleep(1000)
      println("El programa espera a que la retrollamada termine.")
    case Failure(e) => println(e)
  }

  Await.ready(f1, Duration.Inf)
  println("f1 se ha completado")
  Await.ready(f2, Duration.Inf)
  println("f2 se ha completado")
  println("Fin")

  def test(n: Int): Future[Int] = Future {
    if (n > 0) n * 10 else throw new IllegalArgumentException("El valor no puede ser menor que cero")
  }
}
