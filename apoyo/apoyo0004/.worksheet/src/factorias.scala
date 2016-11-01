//Un singleton y una clase que compartan el mismo nombre, paquete y archivo se llaman companions
//Pueden acceder a la parte privada del otro
object factorias {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(204); 
  println("Welcome to the Scala worksheet")
  object TestCompanion {
    private val mensaje = "Valor por defecto"
  }
  class TestCompanion(texto: String = TestCompanion.mensaje) {
    println(texto)
  };$skip(181); val res$0 = 
  new TestCompanion;System.out.println("""res0: factorias.TestCompanion = """ + $show(res$0));$skip(25); val res$1 = 
  new TestCompanion("a");System.out.println("""res1: factorias.TestCompanion = """ + $show(res$1))}
}
