object funcionesaltonivel {
  println("Welcome to the Scala worksheet")

  //Función map
  //trait Traversable[A] {
  //	def map[B](f: A => B): Traversable[B]
  //	...
  List("aa", "b", "ccc").map(_ length)

  //Función flatMap (Debería llamarse mapFlat)
  //  trait Traversable[A] {
  //	def flatMap[B](f: A => Traversable[B]): Traversable[B]
  //	...
  //Sin flatMap
  Seq("En un", "lugar de la mancha").map(s => s.split(" "))
  //Con flatMap
  Seq("En un", "lugar de la mancha").flatMap(s => s.split(" "))
  //Funciones filter y filterNot
	//trait Traversable[A] {
	//def filter(f: A => Boolean): Traversable[A]
	//...
	(1 to 10).toList.filter(_ < 6)
	(1 to 10).toList.filterNot(_ < 6)
}