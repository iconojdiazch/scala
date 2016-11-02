object acceso {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(101); 
  //Una sequencia relaciones un elemento con su posición através de un índice
  val n = Seq(1, 2, 3);System.out.println("""n  : Seq[Int] = """ + $show(n ));$skip(7); val res$0 = 
  n(0);System.out.println("""res0: Int = """ + $show(res$0));$skip(132); val res$1 = 
  //Los operadores que acaban en dos puntos asician de derecha a izquierda,
  //no de izquierda a derecha como es habitual
  n :+ 4;System.out.println("""res1: Seq[Int] = """ + $show(res$1));$skip(10); val res$2 = 
  n.:+(4);System.out.println("""res2: Seq[Int] = """ + $show(res$2));$skip(10); val res$3 = 
  27 +: n;System.out.println("""res3: Seq[Int] = """ + $show(res$3));$skip(21); 
  n.foreach(println);$skip(61); 

  //Un conjunto no admite duplicados
  val s = Set(1, 2, 3);System.out.println("""s  : scala.collection.immutable.Set[Int] = """ + $show(s ));$skip(21); 
  s.foreach(println);$skip(7); val res$4 = 
  s(1);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(16); val res$5 = 
  s.contains(6);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(8); val res$6 = 
  s + 4;System.out.println("""res6: scala.collection.immutable.Set[Int] = """ + $show(res$6));$skip(15); val res$7 = 
  s == (s + 4);System.out.println("""res7: Boolean = """ + $show(res$7));$skip(8); val res$8 = 
  s + 1;System.out.println("""res8: scala.collection.immutable.Set[Int] = """ + $show(res$8));$skip(15); val res$9 = 
  s == (s + 1);System.out.println("""res9: Boolean = """ + $show(res$9));$skip(147); val res$10 = 

  // Un tuple es una agrupación de objetos del mismo o diferenre tipo, no una colección
  //Scala porporciona tuples de Tuple1 a Tuple22
  (1, 2);System.out.println("""res10: (Int, Int) = """ + $show(res$10));$skip(14); val res$11 = 
  (1, "a", 2);System.out.println("""res11: (Int, String, Int) = """ + $show(res$11));$skip(11); val res$12 = 
  ("b", 1);System.out.println("""res12: (String, Int) = """ + $show(res$12));$skip(14); val res$13 = 
  ("b", 1)._1;System.out.println("""res13: String = """ + $show(res$13));$skip(14); val res$14 = 
  ("b", 1)._2;System.out.println("""res14: Int = """ + $show(res$14));$skip(89); val res$15 = 
  //Un tuple puede también declararse empleando el operador ->
  1 -> new java.util.Date
  //Internamente un tuple es una case class parametrizada
  case class MiTuple2[A, B](_1: A, _2: B);System.out.println("""res15: (Int, java.util.Date) = """ + $show(res$15));$skip(127); 
  val t = MiTuple2(1, "a");System.out.println("""t  : acceso.MiTuple2[Int,String] = """ + $show(t ));$skip(7); val res$16 = 
  t._1;System.out.println("""res16: Int = """ + $show(res$16));$skip(7); val res$17 = 
  t._2;System.out.println("""res17: String = """ + $show(res$17));$skip(208); val res$18 = 

  //Un mapa asocia una clave con un valor. No se admiten duplicados en las claves, pero sí
  //en los valores. Es decir, un mapa es una colección de pares clave-valor con claves únicas
  Map(1 -> 1, 2 -> 1);System.out.println("""res18: scala.collection.immutable.Map[Int,Int] = """ + $show(res$18));$skip(30); val res$19 = 
  Map(1 -> 1, 2 -> 2, 1 -> 3);System.out.println("""res19: scala.collection.immutable.Map[Int,Int] = """ + $show(res$19));$skip(41); 
  val mapa = Map(1 -> "uno", 2 -> "dos");System.out.println("""mapa  : scala.collection.immutable.Map[Int,String] = """ + $show(mapa ));$skip(10); val res$20 = 
  mapa(2);System.out.println("""res20: String = """ + $show(res$20));$skip(119); val res$21 = 
  //El acceso a una clave inexistente provoca una excepción
  //mapa(0)
  //Pero no de estas dos maneras
  mapa.get(0);System.out.println("""res21: Option[String] = """ + $show(res$21));$skip(28); val res$22 = 
  mapa.getOrElse(0, "cero");System.out.println("""res22: String = """ + $show(res$22));$skip(62); 

  //Los arrays son un caso especial
  val a = Array(1, 2, 3);System.out.println("""a  : Array[Int] = """ + $show(a ));$skip(7); val res$23 = 
  a(0);System.out.println("""res23: Int = """ + $show(res$23));$skip(11); 
  a(0) = 7;$skip(4); val res$24 = 
  a;System.out.println("""res24: Array[Int] = """ + $show(res$24));$skip(71); 
  
  //Compartir estructura (structural sharing)
  val l = List(1,2,3);System.out.println("""l  : List[Int] = """ + $show(l ));$skip(18); 
  val l1 = l.tail;System.out.println("""l1  : List[Int] = """ + $show(l1 ));$skip(15); val res$25 = 
  l.tail == l1;System.out.println("""res25: Boolean = """ + $show(res$25))}
}
