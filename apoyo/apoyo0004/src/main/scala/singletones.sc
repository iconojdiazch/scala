object singletones {
  println("Welcome to the Scala worksheet")
  //Reemplazo Scala del static de Java
  //Casos de uso típicos:
  //Aplicaciones de escritorio
  //Almacenamiento de constantes
  //Factorías de objetos, los llamados "Companion objects"
  object Prueba {
    def m = "Dos"
    val c = "Constante"
  }
  Prueba.m
  Prueba.c

  object Principal {
    def main(args: Array[String]): Unit = {
      println("Programa principal")
    }
  }
  Principal.main(Array())
}