object acceso {
  println("Welcome to the Scala worksheet")
  //Una sequencia relaciones un elemento con su posición através de un índice
  val n = Seq(1, 2, 3)
  n(0)
  //Los operadores que acaban en dos puntos asician de derecha a izquierda,
  //no de izquierda a derecha como es habitual
  n :+ 4
  n.:+(4)
  27 +: n
  n.foreach(println)

  //Un conjunto no admite duplicados
  val s = Set(1, 2, 3)
  s.foreach(println)
  s(1)
  s.contains(6)
  s + 4
  s == (s + 4)
  s + 1
  s == (s + 1)

  // Un tuple es una agrupación de objetos del mismo o diferenre tipo, no una colección
  //Scala porporciona tuples de Tuple1 a Tuple22
  (1, 2)
  (1, "a", 2)
  ("b", 1)
  ("b", 1)._1
  ("b", 1)._2
  //Un tuple puede también declararse empleando el operador ->
  1 -> new java.util.Date
  //Internamente un tuple es una case class parametrizada
  case class MiTuple2[A, B](_1: A, _2: B) {
    override def toString = s"(${this._1},${this._2})"
  }
  val t = MiTuple2(1, "a")
  t._1
  t._2

  //Un mapa asocia una clave con un valor. No se admiten duplicados en las claves, pero sí
  //en los valores. Es decir, un mapa es una colección de pares clave-valor con claves únicas
  Map(1 -> 1, 2 -> 1)
  Map(1 -> 1, 2 -> 2, 1 -> 3)
  val mapa = Map(1 -> "uno", 2 -> "dos")
  mapa(2)
  //El acceso a una clave inexistente provoca una excepción
  //mapa(0)
  //Pero no de estas dos maneras
  mapa.get(0)
  mapa.getOrElse(0, "cero")

  //Los arrays son un caso especial
  val a = Array(1, 2, 3)
  a(0)
  a(0) = 7
  a

  //Compartir estructura (structural sharing)
  val l = List(1, 2, 3)
  val l1 = l.tail
  l.tail == l1
}