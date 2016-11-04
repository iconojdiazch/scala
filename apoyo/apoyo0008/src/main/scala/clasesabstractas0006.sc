object clasesabstractas {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

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
  
  val ancestro = new Descendiente                 //> ancestro  : clasesabstractas.Descendiente = clasesabstractas$$anonfun$main$1
                                                  //| $Descendiente$1@1e643faf
  ancestro.metodo1                                //> res0: String = abc
  ancestro.metodo2                                //> res1: Int = 9
}