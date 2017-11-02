import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

/**
  * Created by usuario on 25/01/2017.
  */
object PrincipalFirstCompletedOf extends App {
  val f1: Future[Int] = Future {
    Thread.sleep(1000)
    1000
  }
  val f2: Future[Int] = Future {
    Thread.sleep(2000)
    2000
  }
  val resultadoFuture: Future[Int] = Future firstCompletedOf Seq(f1, f2)
  val resultado: Int = Await.result(resultadoFuture, 30 seconds)
  println(s"El resultado es $resultado")  
}
