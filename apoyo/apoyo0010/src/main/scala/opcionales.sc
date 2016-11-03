object opcionales {
  println("Welcome to the Scala worksheet")

  val mapa = (for (i <- 1 to 10) yield i -> i.toString).toMap
  //Muchos métodos de Scala devuelven valores opcionales
  mapa.get(5)
  mapa.get(-1)

  //Instanciación
  Some("abc")
  Option(null)

  //Es frecuente emplear valores opciones junto con el reconocimiento de patrones
  mapa.get(-11) match {
    case Some(x) => println(s"El valor es $x")
    case None    => println("No se encuentra el valor")
  }

  //Option tiene también funciones de alto nivel conocidas de las colecciones
  mapa.get(5).map(_.toDouble)
  mapa.get(5) map (_.toDouble)  foreach println
  mapa.get(-1).getOrElse("nada")
  
  for {
    a <- mapa.get(7)
    b <- mapa.get(9)
  } yield s"$a $b"

  for {
    a <- mapa.get(7)
    b <- mapa.get(-9)
  } yield s"$a $b"

}