object herencia1 {
  println("Welcome to the Scala worksheet")

  //Herencia de métodos no privados
  class Ancestro {
    def m() = println("En ancestro")
    private def oculto() = println("Oculto")
  }
  class Descendiente extends Ancestro

  new Ancestro().m
  new Descendiente().m

  //Constructores
  class Persona(val n: String)
  class Empleado(n: String) extends Persona(n)
  class Empleado1 extends Persona("abc")

  new Empleado("ggg").n

  //Clases finales
  final class A
  //class B extends A
  
  //Clase selladas (sealed). Solo se pueden extender en el mismo archivo de código fuente
  sealed class Z
  class M extends Z
  final class N extends Z
}