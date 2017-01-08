package sistema

import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.concurrent.duration.DurationInt
import scala.io.Source

object Principal5 extends App {
  val holmesUrl = """http://www.ericrochester.com/clj-data-analysis/data/pg1661.txt"""
  val textos = Future(for {
    archivo <- Seq(holmesUrl)
    origen <- Source fromURL (archivo) getLines
  } yield origen)
  val totalPalabras = textos.flatMap(
    seq => Future { seq map(_.split("\\s+").length) }) map(_.sum)
  println(s"Total palabras: ${Await.result(totalPalabras, 1 minute)}")
} 
