//Un singleton y una clase que compartan el mismo nombre, paquete y archivo se llaman companions
//Pueden acceder a la parte privada del otro
package uno
object factorias {
  println("Welcome to the Scala worksheet")
  object TestCompanion {
    private val mensaje = "Valor por defecto"
  }
  class TestCompanion(texto: String = TestCompanion.mensaje) {
    println(texto)
  }
  new TestCompanion
  new TestCompanion("a")

  object Mayusculas {
    def apply(s: String) = s.toUpperCase()
  }
  Mayusculas("abc")

  class Test(val m: Int) {
    override def toString = m toString
  }
  object Test {
    def apply(n: Int) = new Test(n)
    def unapply(t: Test): Option[Int] = Some(t.m)
  }
  Test(7000) match {
    case Test(numero) => println(numero)
    case _            => println("Valor Inesperado")
  }
}