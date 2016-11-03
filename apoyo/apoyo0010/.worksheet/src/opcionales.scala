object opcionales {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(63); 
  println("Welcome to the Scala worksheet");$skip(64); 

  val mapa = (for (i <- 1 to 10) yield i -> i.toString).toMap;System.out.println("""mapa  : scala.collection.immutable.Map[Int,String] = """ + $show(mapa ));$skip(71); val res$0 = 
  //Muchos métodos de Scala devuelven valores opcionales
  mapa.get(5);System.out.println("""res0: Option[String] = """ + $show(res$0));$skip(15); val res$1 = 
  mapa.get(-1);System.out.println("""res1: Option[String] = """ + $show(res$1));$skip(34); val res$2 = 

  //Instanciación
  Some("abc");System.out.println("""res2: Some[String] = """ + $show(res$2));$skip(15); val res$3 = 
  Option(null);System.out.println("""res3: Option[Null] = """ + $show(res$3));$skip(215); 

  //Es frecuente emplear valores opciones junto con el reconocimiento de patrones
  mapa.get(-11) match {
    case Some(x) => println(s"El valor es $x")
    case None    => println("No se encuentra el valor")
  };$skip(110); val res$4 = 

  //Option tiene también funciones de alto nivel conocidas de las colecciones
  mapa.get(5).map(_.toDouble);System.out.println("""res4: Option[Double] = """ + $show(res$4));$skip(48); 
  mapa.get(5) map (_.toDouble)  foreach println;$skip(33); val res$5 = 
  mapa.get(-1).getOrElse("nada");System.out.println("""res5: String = """ + $show(res$5));$skip(73); val res$6 = 
  
  for {
    a <- mapa.get(7)
    b <- mapa.get(9)
  } yield s"$a $b";System.out.println("""res6: Option[String] = """ + $show(res$6));$skip(72); val res$7 = 

  for {
    a <- mapa.get(7)
    b <- mapa.get(-9)
  } yield s"$a $b";System.out.println("""res7: Option[String] = """ + $show(res$7))}

}
