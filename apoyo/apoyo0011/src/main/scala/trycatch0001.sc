object trycatch {
  println("Welcome to the Scala worksheet")

  //En el estilo de Java
  import java.io._
  def leerArchivo(nombre: String): Int =
    try {
      new FileInputStream(nombre).read
    } catch {
      case fe: FileNotFoundException => -1
      case _: Exception              => -2
    }
  leerArchivo("abc")

  //Un estilo intermedio
  import scala.util.{ Either, Right, Left }
  def leerArchivo1(nombre: String): Either[String, Int] =
    try {
      Right(new FileInputStream(nombre).read)
    } catch {
      case fe: FileNotFoundException => Left("No se encuentra el archivo")
      case _: Exception              => Left("Error desconocido")
    }
  leerArchivo1("abc") match {
    case Right(numero) => println(s"Leido $numero")
    case Left(mensaje) => println(mensaje)
  }
}