//Sintaxis básica de un método en Scala:
/*
	def
	nombre del método
	lista opcional de parámetros
	lo que el método devuelve, opcional
	un signo = y el cuerpo, opcionalmente entre llaves
*/
object metodos {
  println("Welcome to the Scala worksheet")
  def metodoSimple = "Hola"
  metodoSimple

  def metodoSimple2() = "Hola"
  metodoSimple2

  def conParametros(s: String): String = "dos"
  conParametros("a")

  def sideEffect(s: String): Unit = println(s)
  sideEffect("b")

  def sideEffect2(s: String) { println(s) }
  sideEffect2("c")

  //En Scala, los métodos pueden tener valores por defecto
  //Podemos referirnos a un parámetro por su nombre
  def defecto(s1: String = "ab", s2: String = "cd") = {
    s1 + " " + s2
  }
  defecto()
  defecto("uno")
  defecto("dos")
  defecto(s2 = "dos")
}