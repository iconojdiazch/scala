object buclesfor {
  println("Welcome to the Scala worksheet")
  for (n <- 1 to 5) println(n)

  val r = for (n <- 1 to 5) yield n
  r.foreach(println)

  //Generadores
  for (n <- List(1, 2, 3)) yield n toString

  //Generadores múltiples
  for {
    n <- 1 to 3
    m <- 1 to n
  } yield n * m

  for (n <- 1 to 3; m <- 1 to n) yield n * m

  //Filtros
  case class Persona(nombre: String)

  val lista = (1 to 10).map(i => Persona("Nombre" + i))
  val rs = for (persona <- lista if persona.nombre endsWith ("5"))
    yield persona.copy(nombre = persona.nombre + "cambiado")
  println(rs.headOption)

  //Definiciones
  for {
    i <- 1 to 10
    cuadradoPar = i * i if i % 2 == 0
  } yield s"El cuadrao de $i es $cuadradoPar"

  for (i <- 1 to 10; cuadradoPar = i * i if i % 2 == 0)
    yield s"El cuadrao de $i es $cuadradoPar"

  //Traslación
  for (n <- 1 to 5) println(n)
  (1 to 5).foreach(println)

  for (n <- 1 to 5) yield n + 1
  (1 to 5).map(_ + 1)

  for (n <- 1 to 5; m <- 1 to n) yield n * m
  (1 to 3).flatMap(n => (1 to n).map(m => n * m))
}