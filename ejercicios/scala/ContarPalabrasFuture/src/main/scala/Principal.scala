import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.io.Source

object Principal extends App {
  val nombre = "test.txt"
  crearArchivo(nombre, 10000)
  val archivo: Iterator[String] = Source fromFile (nombre) getLines ()

  val it: Iterator[Future[Int]] = archivo map (palabras)
  val t: Future[Iterator[Int]] = Future.sequence(it)
  val resultado: Future[Int] = t map (_.sum)    
  resultado foreach (p => println(s"Palabras totales desde Future.foreach $p"))
  val palabrasTotales: Int = Await.result(resultado, Duration.Inf)
  println(s"Palabras totales desde Await.result $palabrasTotales")

  def palabras(linea: String): Future[Int] =
    Future {
      linea split ("\\s+") length
    }
  def crearArchivo(s: String, n: Int) = {
    val texto = "1 2 3 4 5 6 7 8 9 10\n"
    import java.io.{ BufferedWriter, FileWriter }
    val file = new BufferedWriter(new FileWriter(s))
    for (_ <- 1 to n) file.write(texto)
    file.close
  }
} 
