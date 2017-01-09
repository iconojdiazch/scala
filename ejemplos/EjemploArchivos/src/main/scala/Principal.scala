import scala.io.Source

object Principal extends App {
  List(enSecuencia)
    .map(tiempo(_))
    .foreach {
      case (x, y) => println(s"Tiempo: $x. Palabras: $y")
    }

  def enSecuencia = {
    val holmesUrl = """http://www.ericrochester.com/clj-data-analysis/data/pg1661.txt"""
    val data = Source fromURL (holmesUrl) getLines
    import scala.collection.mutable
    val contador = mutable.Map[String, Int]().withDefault(_ => 0)
    for (clave <- data.flatMap(_.split("\\s+")))
      contador(clave) += 1
    contador.values.sum
  }

  def tiempo[T](bloque: => T) = {
    val inicio = System.nanoTime
    (System.nanoTime - inicio, bloque)
  }
}