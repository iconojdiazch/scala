object lazyinterpolacion {
  println("Welcome to the Scala worksheet")

  //Lazy vals
  val a = {
    println("val a")
    7
  }
  lazy val b = {
    println("val b")
    70
  }
  b

  //Inperpolación de cadenas (string interpolation)
  //Ver http://docs.scala-lang.org/es/overviews/core/string-interpolation
  val n = "abc"
  println(s"El nombre es $n")

  case class Persona(nombre: String)
  val p = Persona("abc")
  println(s"El nombre de $p es ${p.nombre}")

  val doble = 2.0d
  val nombre = "abc"
  println(f"$nombre%s, $doble%2.2f")
  
  s"a\nb"
  raw"a\nb"
}