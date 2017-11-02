import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

/**
  * Created by usuario on 25/01/2017.
  */
object PrincipalSecuenceTraverse extends App {
  val traverse: Future[List[Int]] = Future.traverse((1 to 100).toList)(x => Future(x * 2))
  val traverseSuma: Future[Int] = traverse.map(_.sum)
  traverseSuma foreach println
  Await.ready(traverse, 30 seconds)

  val secuencia: Future[List[Int]] = Future.sequence((1 to 100).toList.map(x => Future(x * 2)))
  val secuenciaSuma: Future[Int] = secuencia.map(_.sum)
  secuenciaSuma foreach println
  Await.ready(secuenciaSuma, 30 seconds)
  println("Fin")
}
