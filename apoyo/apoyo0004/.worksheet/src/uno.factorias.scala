//Un singleton y una clase que compartan el mismo nombre, paquete y archivo se llaman companions
//Pueden acceder a la parte privada del otro
package uno
object factorias {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(216); 
  println("Welcome to the Scala worksheet")
  object TestCompanion {
    private val mensaje = "Valor por defecto"
  }
  class TestCompanion(texto: String = TestCompanion.mensaje) {
    println(texto)
  };$skip(181); val res$0 = 
  new TestCompanion;System.out.println("""res0: uno.factorias.TestCompanion = """ + $show(res$0));$skip(25); val res$1 = 
  new TestCompanion("a")

  object Mayusculas {
    def apply(s: String) = s.toUpperCase()
  };System.out.println("""res1: uno.factorias.TestCompanion = """ + $show(res$1));$skip(91); val res$2 = 
  Mayusculas("abc")

  class Test(val m: Int) {
    override def toString = m toString
  }
  object Test {
    def apply(n: Int) = new Test(n)
  };System.out.println("""res2: String = """ + $show(res$2));$skip(141); val res$3 = 
  Test(7000);System.out.println("""res3: uno.factorias.Test = """ + $show(res$3))}
}
