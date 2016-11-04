object funcionaltry {
  println("Welcome to the Scala worksheet")

  import scala.util.{ Try, Success, Failure }

  //Según Scala, la forma más "funcional" de tratar con errores
  Try("567".toDouble)
  Try("abc".toDouble)

  Try("567".toDouble).map(_ + 1.0d)
  Try("abc".toDouble).map(_ + 1.0d)
  Try("abc".toDouble).toOption.map(_ + 1.0d)

  import java.io._
  def leerArchivo(nombre: String): Try[Int] = Try(new FileInputStream(nombre).read)
  leerArchivo("abc") match {
    case Success(numero)    => println(numero)
    case Failure(excepcion) => println(excepcion getMessage)
  }

  import scala.io.Source
  def leerArchivo1(nombre: String): Try[String] = Try {
    val f = Source.fromFile(nombre)
    f mkString
  }
  leerArchivo1("c:\\install.ini") map (_.length) match {
    case Success(numero) => println(numero)
    case Failure(_)      => println("ha ocurrido un error")
  }

  //Funciones de alto nivel en Try
  def metodo(s: String) = Try(List(s.toInt)) getOrElse (List())
  metodo("1")
  metodo("a")

  for {
    a <- metodo("1")
    b <- metodo("2")
  } yield a + b
  
    for {
    a <- metodo("1")
    b <- metodo("a2")
  } yield a + b
}