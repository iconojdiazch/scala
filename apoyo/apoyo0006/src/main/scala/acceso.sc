object acceso {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  //Una sequencia relaciones un elemento con su posición através de un índice
  val n = Seq(1, 2, 3)                            //> n  : Seq[Int] = List(1, 2, 3)
  n(0)                                            //> res0: Int = 1
  //Los operadores que acaban en dos puntos asician de derecha a izquierda,
  //no de izquierda a derecha como es habitual
  n :+ 4                                          //> res1: Seq[Int] = List(1, 2, 3, 4)
  n.:+(4)                                         //> res2: Seq[Int] = List(1, 2, 3, 4)
  27 +: n                                         //> res3: Seq[Int] = List(27, 1, 2, 3)
  n.foreach(println)                              //> 1
                                                  //| 2
                                                  //| 3

  //Un conjunto no admite duplicados
  val s = Set(1, 2, 3)                            //> s  : scala.collection.immutable.Set[Int] = Set(1, 2, 3)
  s.foreach(println)                              //> 1
                                                  //| 2
                                                  //| 3
  s(1)                                            //> res4: Boolean = true
  s.contains(6)                                   //> res5: Boolean = false
  s + 4                                           //> res6: scala.collection.immutable.Set[Int] = Set(1, 2, 3, 4)
  s == (s + 4)                                    //> res7: Boolean = false
  s + 1                                           //> res8: scala.collection.immutable.Set[Int] = Set(1, 2, 3)
  s == (s + 1)                                    //> res9: Boolean = true

  // Un tuple es una agrupación de objetos del mismo o diferenre tipo, no una colección
  //Scala porporciona tuples de Tuple1 a Tuple22
  (1, 2)                                          //> res10: (Int, Int) = (1,2)
  (1, "a", 2)                                     //> res11: (Int, String, Int) = (1,a,2)
  ("b", 1)                                        //> res12: (String, Int) = (b,1)
  ("b", 1)._1                                     //> res13: String = b
  ("b", 1)._2                                     //> res14: Int = 1
  //Un tuple puede también declararse empleando el operador ->
  1 -> new java.util.Date                         //> res15: (Int, java.util.Date) = (1,Wed Nov 02 12:54:44 CET 2016)
  //Internamente un tuple es una case class parametrizada
  case class MiTuple2[A, B](_1: A, _2: B)
  val t = MiTuple2(1, "a")                        //> t  : acceso.MiTuple2[Int,String] = MiTuple2(1,a)
  t._1                                            //> res16: Int = 1
  t._2                                            //> res17: String = a

  //Un mapa asocia una clave con un valor. No se admiten duplicados en las claves, pero sí
  //en los valores. Es decir, un mapa es una colección de pares clave-valor con claves únicas
  Map(1 -> 1, 2 -> 1)                             //> res18: scala.collection.immutable.Map[Int,Int] = Map(1 -> 1, 2 -> 1)
  Map(1 -> 1, 2 -> 2, 1 -> 3)                     //> res19: scala.collection.immutable.Map[Int,Int] = Map(1 -> 3, 2 -> 2)
  val mapa = Map(1 -> "uno", 2 -> "dos")          //> mapa  : scala.collection.immutable.Map[Int,String] = Map(1 -> uno, 2 -> dos
                                                  //| )
  mapa(2)                                         //> res20: String = dos
  //El acceso a una clave inexistente provoca una excepción
  //mapa(0)
  //Pero no de estas dos maneras
  mapa.get(0)                                     //> res21: Option[String] = None
  mapa.getOrElse(0, "cero")                       //> res22: String = cero

  //Los arrays son un caso especial
  val a = Array(1, 2, 3)                          //> a  : Array[Int] = Array(1, 2, 3)
  a(0)                                            //> res23: Int = 1
  a(0) = 7
  a                                               //> res24: Array[Int] = Array(7, 2, 3)
  
  //Compartir estructura (structural sharing)
  val l = List(1,2,3)                             //> l  : List[Int] = List(1, 2, 3)
  val l1 = l.tail                                 //> l1  : List[Int] = List(2, 3)
  l.tail == l1                                    //> res25: Boolean = true
}