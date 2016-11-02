object instanciacion {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(66); 
  println("Welcome to the Scala worksheet");$skip(17); val res$0 = 
  Array(1, 2, 3);System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(21); val res$1 = 
  Seq("a", "b", "c");System.out.println("""res1: Seq[String] = """ + $show(res$1));$skip(18); val res$2 = 
  Set(1, 2, 2, 3);System.out.println("""res2: scala.collection.immutable.Set[Int] = """ + $show(res$2));$skip(43); val res$3 = 
  Map(1 -> "uno", 2 -> "dos", 2 -> "tres");System.out.println("""res3: scala.collection.immutable.Map[Int,String] = """ + $show(res$3));$skip(15); val res$4 = 
  Set(1,2,"3");System.out.println("""res4: scala.collection.immutable.Set[Any] = """ + $show(res$4));$skip(217); val res$5 = 
  
  //Cada clase de tipo colección está asociada a un companion object, el cual
  //tiene una función llamada apply que es la que crea realmente el objeto, esto es,
  //apply es un método de factoría
  Vector(1,2,3);System.out.println("""res5: scala.collection.immutable.Vector[Int] = """ + $show(res$5));$skip(55); val res$6 = 
  //Esto nos permitiría escribir
  Vector.apply(1,2,3);System.out.println("""res6: scala.collection.immutable.Vector[Int] = """ + $show(res$6))}
}
