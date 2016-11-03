object buclesfor {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  println("Welcome to the Scala worksheet");$skip(31); 
  for (n <- 1 to 5) println(n);$skip(38); 

  val r = for (n <- 1 to 5) yield n;System.out.println("""r  : scala.collection.immutable.IndexedSeq[Int] = """ + $show(r ));$skip(21); 
  r.foreach(println);$skip(62); val res$0 = 

  //Generadores
  for (n <- List(1, 2, 3)) yield n toString;System.out.println("""res0: List[String] = """ + $show(res$0));$skip(84); val res$1 = 

  //Generadores múltiples
  for {
    n <- 1 to 3
    m <- 1 to n
  } yield n * m;System.out.println("""res1: scala.collection.immutable.IndexedSeq[Int] = """ + $show(res$1));$skip(47); val res$2 = 

  for (n <- 1 to 3; m <- 1 to n) yield n * m

  //Filtros
  case class Persona(nombre: String);System.out.println("""res2: scala.collection.immutable.IndexedSeq[Int] = """ + $show(res$2));$skip(109); 

  val lista = (1 to 10).map(i => Persona("Nombre" + i));System.out.println("""lista  : scala.collection.immutable.IndexedSeq[buclesfor.Persona] = """ + $show(lista ));$skip(128); 
  val rs = for (persona <- lista if persona.nombre endsWith ("5"))
    yield persona.copy(nombre = persona.nombre + "cambiado");System.out.println("""rs  : scala.collection.immutable.IndexedSeq[buclesfor.Persona] = """ + $show(rs ));$skip(25); 
  println(rs.headOption);$skip(128); val res$3 = 

  //Definiciones
  for {
    i <- 1 to 10
    cuadradoPar = i * i if i % 2 == 0
  } yield s"El cuadrao de $i es $cuadradoPar";System.out.println("""res3: scala.collection.immutable.IndexedSeq[String] = """ + $show(res$3));$skip(104); val res$4 = 

  for (i <- 1 to 10; cuadradoPar = i * i if i % 2 == 0)
    yield s"El cuadrao de $i es $cuadradoPar";System.out.println("""res4: scala.collection.immutable.IndexedSeq[String] = """ + $show(res$4));$skip(48); 

  //Traslación
  for (n <- 1 to 5) println(n);$skip(28); 
  (1 to 5).foreach(println);$skip(34); val res$5 = 

  for (n <- 1 to 5) yield n + 1;System.out.println("""res5: scala.collection.immutable.IndexedSeq[Int] = """ + $show(res$5));$skip(22); val res$6 = 
  (1 to 5).map(_ + 1);System.out.println("""res6: scala.collection.immutable.IndexedSeq[Int] = """ + $show(res$6));$skip(47); val res$7 = 

  for (n <- 1 to 5; m <- 1 to n) yield n * m;System.out.println("""res7: scala.collection.immutable.IndexedSeq[Int] = """ + $show(res$7));$skip(50); val res$8 = 
  (1 to 3).flatMap(n => (1 to n).map(m => n * m));System.out.println("""res8: scala.collection.immutable.IndexedSeq[Int] = """ + $show(res$8))}
}
