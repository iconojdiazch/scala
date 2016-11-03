object funcionaltry {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  println("Welcome to the Scala worksheet")

  import scala.util.{ Try, Success, Failure };$skip(136); val res$0 = 

  //Según Scala, la forma más "funcional" de tratar con errores
  Try("567".toDouble);System.out.println("""res0: scala.util.Try[Double] = """ + $show(res$0));$skip(22); val res$1 = 
  Try("abc".toDouble);System.out.println("""res1: scala.util.Try[Double] = """ + $show(res$1));$skip(38); val res$2 = 

  Try("567".toDouble).map(_ + 1.0d);System.out.println("""res2: scala.util.Try[Double] = """ + $show(res$2));$skip(36); val res$3 = 
  Try("abc".toDouble).map(_ + 1.0d);System.out.println("""res3: scala.util.Try[Double] = """ + $show(res$3));$skip(45); val res$4 = 
  Try("abc".toDouble).toOption.map(_ + 1.0d)

  import java.io._;System.out.println("""res4: Option[Double] = """ + $show(res$4));$skip(105); 
  def leerArchivo(nombre: String): Try[Int] = Try(new FileInputStream(nombre).read);System.out.println("""leerArchivo: (nombre: String)scala.util.Try[Int]""");$skip(141); 
  leerArchivo("abc") match {
    case Success(numero)    => println(numero)
    case Failure(excepcion) => println(excepcion getMessage)
  }

  import scala.io.Source;$skip(138); 
  def leerArchivo1(nombre: String): Try[String] = Try {
    val f = Source.fromFile(nombre)
    f mkString
  };System.out.println("""leerArchivo1: (nombre: String)scala.util.Try[String]""");$skip(165); 
  leerArchivo1("c:\\install.ini") map (_.length) match {
    case Success(numero) => println(numero)
    case Failure(_)      => println("ha ocurrido un error")
  };$skip(101); 

  //Funciones de alto nivel en Try
  def metodo(s: String) = Try(List(s.toInt)) getOrElse (List());System.out.println("""metodo: (s: String)List[Int]""");$skip(14); val res$5 = 
  metodo("1");System.out.println("""res5: List[Int] = """ + $show(res$5));$skip(14); val res$6 = 
  metodo("a");System.out.println("""res6: List[Int] = """ + $show(res$6));$skip(68); val res$7 = 

  for {
    a <- metodo("1")
    b <- metodo("2")
  } yield a + b;System.out.println("""res7: List[Int] = """ + $show(res$7));$skip(72); val res$8 = 
  
    for {
    a <- metodo("1")
    b <- metodo("a2")
  } yield a + b;System.out.println("""res8: List[Int] = """ + $show(res$8))}
}
