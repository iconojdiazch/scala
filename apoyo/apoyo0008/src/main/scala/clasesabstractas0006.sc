object clasesabstractas {
  println("Welcome to the Scala worksheet")

  //Clases abstractas. No pueden tener instancias
  abstract class Ancestro {
    def metodo1: String
    def metodo2: Int
  }

  //En un descendiente, override es opcional
  class Descendiente extends Ancestro {
    def metodo1: String = "abc"
    override def metodo2: Int = 9
  }

  val ancestro: Ancestro = new Descendiente
  ancestro.metodo1
  ancestro.metodo2
}