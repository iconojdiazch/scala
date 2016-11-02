object funcionesaltonivel {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(71); 
  println("Welcome to the Scala worksheet");$skip(136); val res$0 = 

  //Función map
  //trait Traversable[A] {
  //	def map[B](f: A => B): Traversable[B]
  //	...
  List("aa", "b", "ccc").map(_ length);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(223); val res$1 = 

  //Función flatMap (Debería llamarse mapFlat)
  //  trait Traversable[A] {
  //	def flatMap[B](f: A => Traversable[B]): Traversable[B]
  //	...
  //Sin flatMap
  Seq("En un", "lugar de la mancha").map(s => s.split(" "));System.out.println("""res1: Seq[Array[String]] = """ + $show(res$1));$skip(80); val res$2 = 
  //Con flatMap
  Seq("En un", "lugar de la mancha").flatMap(s => s.split(" "));System.out.println("""res2: Seq[String] = """ + $show(res$2));$skip(145); val res$3 = 
  //Funciones filter y filterNot
	//trait Traversable[A] {
	//def filter(f: A => Boolean): Traversable[A]
	//...
	(1 to 10).toList.filter(_ < 6);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(35); val res$4 = 
	(1 to 10).toList.filterNot(_ < 6);System.out.println("""res4: List[Int] = """ + $show(res$4))}
}
