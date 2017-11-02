import scala.io.Source

object Principal extends App {
  val nombre = "test.txt"
  crearArchivo(nombre, 1000)
  println(s"Palabras totales usando un for-comprenhension ${palabrasConExpresionFor(nombre)}")
  println(s"Palabras totales usando funciones ${palabrasConFunciones(nombre)}")

  def palabrasConFunciones(file: String) = {
    val archivo = Source fromFile (file)
    val iteradorLazy = archivo getLines ()
    iteradorLazy flatMap (_.split("\\s+")) map (_.length) sum
  }

  def palabrasConExpresionFor(file: String) = {
    val archivo = Source fromFile (file)
    val iteradorLazy = archivo getLines ()
    val intermedio = for {
      linea <- iteradorLazy
      palabras <- linea split ("\\s+")
    } yield palabras length ()
    intermedio sum
  }
  def crearArchivo(s: String, n: Int) = {
    val texto = "1 2 3 4 5 6 7 8 9 10\n"
    import java.io.{ BufferedWriter, FileWriter }
    val file = new BufferedWriter(new FileWriter(s))
    for (_ <- 1 to n) file.write(texto)
    file.close
  }
} 
