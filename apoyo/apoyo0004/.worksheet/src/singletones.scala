object singletones {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  println("Welcome to the Scala worksheet")
  //Reemplazo Scala del static de Java
  //Casos de uso típicos:
  //Aplicaciones de escritorio
  //Almacenamiento de constantes
  //Factorías de objetos, los llamados "Companion objects"
  object Prueba {
    def m = "Dos"
    val c = "Constante"
  };$skip(263); val res$0 = 
  Prueba.m;System.out.println("""res0: String = """ + $show(res$0));$skip(11); val res$1 = 
  Prueba.c

  object Principal {
    def main(args: Array[String]): Unit = {
      println("Programa principal")
    }
  };System.out.println("""res1: String = """ + $show(res$1));$skip(139); 
  Principal.main(Array())}
}
