//Sintaxis básica de un método en Scala:
/*
	def
	nombre del método
	lista opcional de parámetros
	lo que el método devuelve, opcional
	un signo = y el cuerpo, opcionalmente entre llaves
*/
object metodos {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(250); 
  println("Welcome to the Scala worksheet");$skip(28); 
  def metodoSimple = "Hola";System.out.println("""metodoSimple: => String""");$skip(15); val res$0 = 
  metodoSimple;System.out.println("""res0: String = """ + $show(res$0));$skip(33); 

  def metodoSimple2() = "Hola";System.out.println("""metodoSimple2: ()String""");$skip(18); val res$1 = 
  metodoSimple2();System.out.println("""res1: String = """ + $show(res$1));$skip(49); 

  def conParametros(s: String): String = "dos";System.out.println("""conParametros: (s: String)String""");$skip(21); val res$2 = 
  conParametros("a");System.out.println("""res2: String = """ + $show(res$2));$skip(49); 

  def sideEffect(s: String): Unit = println(s);System.out.println("""sideEffect: (s: String)Unit""");$skip(18); 
  sideEffect("b");$skip(46); 

  def sideEffect2(s: String) { println(s) };System.out.println("""sideEffect2: (s: String)Unit""");$skip(19); 
  sideEffect2("c");$skip(191); 

  //En Scala, los métodos pueden tener valores por defecto
  //Podemos referirnos a un parámetro por su nombre
  def defecto(s1: String = "ab", s2: String = "cd") = {
    s1 + " " + s2
  };System.out.println("""defecto: (s1: String, s2: String)String""");$skip(12); val res$3 = 
  defecto();System.out.println("""res3: String = """ + $show(res$3));$skip(17); val res$4 = 
  defecto("uno");System.out.println("""res4: String = """ + $show(res$4));$skip(17); val res$5 = 
  defecto("dos");System.out.println("""res5: String = """ + $show(res$5));$skip(22); val res$6 = 
  defecto(s2 = "dos");System.out.println("""res6: String = """ + $show(res$6))}
}
