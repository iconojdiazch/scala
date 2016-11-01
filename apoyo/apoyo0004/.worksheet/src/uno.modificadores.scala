package uno
object modificadores {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(78); 
  println("Welcome to the Scala worksheet")}
  class A {
    private val b = "b"
    protected val c = "c"
  }

  class B {
    //Privado dentro del paquete uno
    private[uno] val texto = "b"
  }

  class C {
    //Privado a nivel de instancia de la Clase C
    private[this] val texto = "b"
    val x = new B().texto
    def iguales(otro: C) =
      this.texto == otro.texto // No compila por el private[this]. Quitarlo para verlo
  }
}
