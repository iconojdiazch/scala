object patternmatching {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(68); 
  println("Welcome to the Scala worksheet");$skip(198); 

  //Diferentes Match Patterns

  //Wildcard Pattern. Representa algo parecido al default de Java en un switch.
  //Si no lo penmos y no hay un caso que cuadre, MatchError
  val x: String = "abc";System.out.println("""x  : String = """ + $show(x ));$skip(54); val res$0 = 
  x match {
    case _ => "Resultado por defecto"
  };System.out.println("""res0: String = """ + $show(res$0));$skip(151); val res$1 = 

  //Variable Pattern. El identificador (valor en nuestro ejemplo) debe empezar por minúscula
  x match {
    case valor => s"El valor es $valor"
  }

  //Typed Pattern
  import java.util.Date;System.out.println("""res1: String = """ + $show(res$1));$skip(193); 
  def typedPattern(any: Any): String = any match {
    case fecha: Date => s"La fecha es $fecha"
    case _           => s"$any no es una fecha"
  };System.out.println("""typedPattern: (any: Any)String""");$skip(22); val res$2 = 
  typedPattern("abc");System.out.println("""res2: String = """ + $show(res$2));$skip(25); val res$3 = 
  typedPattern(new Date);System.out.println("""res3: String = """ + $show(res$3));$skip(207); 

  //Constant Pattern
  def constantPattern(s: String) = s match {
    case "abc"         => "Valor esperado"
    case "abc" | "def" => "Valor esperado dos"
    case _             => "Valor inesperado"
  };System.out.println("""constantPattern: (s: String)String""");$skip(25); val res$4 = 
  constantPattern("abc");System.out.println("""res4: String = """ + $show(res$4));$skip(25); val res$5 = 
  constantPattern("def");System.out.println("""res5: String = """ + $show(res$5));$skip(23); val res$6 = 
  constantPattern("1");System.out.println("""res6: String = """ + $show(res$6));$skip(164); 

  //Stable identifiers pattern: literales, identificadores val o singletones comenzando
  //por mayúscula, o en minúscula entre backticks
  val lasDoce = "12:00"
  object Singleton {
    val test = "abc"
  };System.out.println("""lasDoce  : String = """ + $show(lasDoce ));$skip(223); 
  def stableIdentifiers(any: Any): String = any match {
    case `lasDoce`      => "Son las doce"
    case Singleton.test => "Prueba"
    case _              => "Otra cosa"
  };System.out.println("""stableIdentifiers: (any: Any)String""");$skip(29); val res$7 = 
  stableIdentifiers("12:00");System.out.println("""res7: String = """ + $show(res$7));$skip(27); val res$8 = 
  stableIdentifiers("abc");System.out.println("""res8: String = """ + $show(res$8));$skip(27); val res$9 = 
  stableIdentifiers("xyz");System.out.println("""res9: String = """ + $show(res$9));$skip(164); 

  //Tuple Pattern
  def tuplePattern(any: Any): String = any match {
    case (x, "12:00") => s"Desde las $x a las doce"
    case _            => "Otra cosa"
  };System.out.println("""tuplePattern: (any: Any)String""");$skip(30); val res$10 = 
  tuplePattern((10, "12:00"));System.out.println("""res10: String = """ + $show(res$10));$skip(19); val res$11 = 
  tuplePattern(45)

  //Constructor Pattern
  case class Persona(nombre: String, edad: Int);System.out.println("""res11: String = """ + $show(res$11));$skip(320); 

  def constructorPattern(any: Any): String = any match {
    case Persona("abc", 20)   => "Una persona con 20 años de edad"
    case Persona("abc", edad) => s"Una persona con $edad años de edad"
    case _                    => "Otra cosa"
  };System.out.println("""constructorPattern: (any: Any)String""");$skip(41); val res$12 = 
  constructorPattern(Persona("abc", 20));System.out.println("""res12: String = """ + $show(res$12));$skip(41); val res$13 = 
  constructorPattern(Persona("abc", 30));System.out.println("""res13: String = """ + $show(res$13));$skip(25); val res$14 = 
  constructorPattern(34);System.out.println("""res14: String = """ + $show(res$14));$skip(48); 

  //Sequence Pattern
  val sec = Seq(1, 2, 3);System.out.println("""sec  : Seq[Int] = """ + $show(sec ));$skip(11); val res$15 = 
  sec.head;System.out.println("""res15: Int = """ + $show(res$15));$skip(11); val res$16 = 
  sec.tail;System.out.println("""res16: Seq[Int] = """ + $show(res$16));$skip(291); 

  def sequencePattern(xs: Seq[Int]) = xs match {
    case Seq(1, 2, 3)    => "Valor esperado"
    case Seq(1, _*)      => "La secuencia comienza por 1"
    case Seq(8, _, _, 4) => "La secuencia tiene 4 elementos empieza por 8 y acaba en 4"
    case _               => "Otra secuencia"
  };System.out.println("""sequencePattern: (xs: Seq[Int])String""");$skip(23); val res$17 = 
  sequencePattern(sec);System.out.println("""res17: String = """ + $show(res$17));$skip(33); val res$18 = 
  sequencePattern(sec ++ Seq(4));System.out.println("""res18: String = """ + $show(res$18));$skip(36); val res$19 = 
  sequencePattern(Seq(8, 9, 10, 4));System.out.println("""res19: String = """ + $show(res$19));$skip(25); val res$20 = 
  sequencePattern(Seq());System.out.println("""res20: String = """ + $show(res$20));$skip(134); 

  //Recursión
  def longitudSec(l: Seq[Int]): Int = l match {
    case x :: xs => 1 + longitudSec(l.tail)
    case Nil     => 0
  };System.out.println("""longitudSec: (l: Seq[Int])Int""");$skip(19); val res$21 = 
  longitudSec(sec)

  //Recursión "de cola" y generalización
  import scala.annotation.tailrec;System.out.println("""res21: Int = """ + $show(res$21));$skip(283); 
  def longitudSec1[A](l: Seq[A]) = {
    @tailrec
    def loop(xs: Seq[A], acc: Int): Int = xs match {
      case head :: tail => loop(tail, acc + 1)
      case Nil          => acc
    }
    loop(l, 0)
  };System.out.println("""longitudSec1: [A](l: Seq[A])Int""");$skip(36); val res$22 = 
  longitudSec1(List("1", "2", "3"));System.out.println("""res22: Int = """ + $show(res$22));$skip(344); 

  //Pattern binders. Uso de restricciones (pattern guards)
  def patternBinders(p: Persona): String = p match {
    case persona @ Persona(_, 20)           => s"$persona con nombre ${persona.nombre}"
    case persona @ Persona(_, n) if n == 30 => s"$persona con edad $n"
    case _                                  => s"Otra persona: $p"
  };System.out.println("""patternBinders: (p: patternmatching.Persona)String""");$skip(35); val res$23 = 
  patternBinders(Persona("a", 20));System.out.println("""res23: String = """ + $show(res$23));$skip(35); val res$24 = 
  patternBinders(Persona("a", 30));System.out.println("""res24: String = """ + $show(res$24));$skip(35); val res$25 = 
  patternBinders(Persona("a", 35));System.out.println("""res25: String = """ + $show(res$25));$skip(69); 

  //Pattern tuples (vals con patrones)
  val (uno, dos) = (1, "2");System.out.println("""uno  : Int = """ + $show(uno ));System.out.println("""dos  : String = """ + $show(dos ));$skip(32); 
  val (tres, cuatro) = 1 -> "2";System.out.println("""tres  : Int = """ + $show(tres ));System.out.println("""cuatro  : String = """ + $show(cuatro ));$skip(28); 
  val (cinco, _) = 1 -> "2";System.out.println("""cinco  : Int = """ + $show(cinco ));$skip(27); 
  val (_, seis) = 1 -> "2";System.out.println("""seis  : String = """ + $show(seis ));$skip(30); 
  val List(a, b) = List(1, 2);System.out.println("""a  : Int = """ + $show(a ));System.out.println("""b  : Int = """ + $show(b ));$skip(40); 
  val List(head, _*) = (1 to 10).toList;System.out.println("""head  : Int = """ + $show(head ));$skip(108); 

  //Patterns en for comprehensions (bucles y expresiones for)
  val c = (1 to 10).map(i => (i, i)).toList;System.out.println("""c  : List[(Int, Int)] = """ + $show(c ));$skip(58); val res$26 = 
  //Sin pattern matching
  for (x <- c) yield x._1 + x._2;System.out.println("""res26: List[Int] = """ + $show(res$26));$skip(57); val res$27 = 
  //Con pattern matching
  for ((a, b) <- c) yield a + b;System.out.println("""res27: List[Int] = """ + $show(res$27))}

}
