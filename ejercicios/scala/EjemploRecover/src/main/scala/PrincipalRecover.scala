import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}
/**
  * Created by usuario on 25/01/2017.
  */
object PrincipalRecover extends App{
  val testOk: Future[Int] = test(1) recover {
    case e: IllegalArgumentException => 0
  }
  val r1: Int = Await.result(testOk, 30 seconds)
  println(s"El resultado es $r1")

  val testMal: Future[Int] = test(0) recover {
    case e: IllegalArgumentException => 0
  }
  val r2: Int = Await.result(testMal, 30 seconds)
  println(s"El resultado es $r2")


  def test(n: Int): Future[Int] = Future {
    if (n > 0) n * 10 else throw new IllegalArgumentException("El valor no puede ser menor que cero")
  }
}
