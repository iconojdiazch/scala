object trycatch {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  println("Welcome to the Scala worksheet")

  //En el estilo de Java
  import java.io._;$skip(242); 
  def leerArchivo(nombre: String): Int =
    try {
      new FileInputStream(nombre).read
    } catch {
      case fe: FileNotFoundException => -1
      case _: Exception              => -2
    };System.out.println("""leerArchivo: (nombre: String)Int""");$skip(21); val res$0 = 
  leerArchivo("abc")

  //Un estilo intermedio
  import scala.util.{ Either, Right, Left };System.out.println("""res0: Int = """ + $show(res$0));$skip(346); 
  def leerArchivo1(nombre: String): Either[String, Int] =
    try {
      Right(new FileInputStream(nombre).read)
    } catch {
      case fe: FileNotFoundException => Left("No se encuentra el archivo")
      case _: Exception              => Left("Error desconocido")
    };System.out.println("""leerArchivo1: (nombre: String)scala.util.Either[String,Int]""");$skip(129); 
  leerArchivo1("abc") match {
    case Right(numero) => println(s"Leido $numero")
    case Left(mensaje) => println(mensaje)
  }}
}
