import scala.concurrent.Future
import scala.util.Random
import scala.concurrent.ExecutionContext.Implicits.global

package object sistema {
  def dormir(millis: Long, mensaje: String = "Sin especificar") {
    println(mensaje)
    Thread sleep (millis)
  }
  def ejecutar(i: Int): Future[Int] = Future {
    dormir(Random.nextInt(500))
    val resultado = i + 10
    println(s"Valor de retorno: $resultado")
    resultado
  }
}