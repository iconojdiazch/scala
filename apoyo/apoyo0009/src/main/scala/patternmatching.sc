object patternmatching {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  //Diferentes Match Patterns

  //Wildcard Pattern. Representa algo parecido al default de Java en un switch.
  //Si no lo penmos y no hay un caso que cuadre, MatchError
  val x: String = "abc"                           //> x  : String = abc
  x match {
    case _ => "Resultado por defecto"
  }                                               //> res0: String = Resultado por defecto

  //Variable Pattern. El identificador (valor en nuestro ejemplo) debe empezar por minúscula
  x match {
    case valor => s"El valor es $valor"
  }                                               //> res1: String = El valor es abc

  //Typed Pattern
  import java.util.Date
  def typedPattern(any: Any): String = any match {
    case fecha: Date => s"La fecha es $fecha"
    case _           => s"$any no es una fecha"
  }                                               //> typedPattern: (any: Any)String
  typedPattern("abc")                             //> res2: String = abc no es una fecha
  typedPattern(new Date)                          //> res3: String = La fecha es Fri Jan 13 11:40:17 CET 2017

  //Constant Pattern
  def constantPattern(s: String) = s match {
    case "abc"         => "Valor esperado"
    case "abc" | "def" => "Valor esperado dos"
    case _             => "Valor inesperado"
  }                                               //> constantPattern: (s: String)String
  constantPattern("abc")                          //> res4: String = Valor esperado
  constantPattern("def")                          //> res5: String = Valor esperado dos
  constantPattern("1")                            //> res6: String = Valor inesperado

  //Stable identifiers pattern: literales, identificadores val o singletones comenzando
  //por mayúscula, o en minúscula entre backticks
  val lasDoce = "12:00"                           //> lasDoce  : String = 12:00
  object Singleton {
    val test = "abc"
  }
  def stableIdentifiers(any: Any): String = any match {
    case `lasDoce`      => "Son las doce"
    case Singleton.test => "Prueba"
    case _              => "Otra cosa"
  }                                               //> stableIdentifiers: (any: Any)String
  stableIdentifiers("12:00")                      //> res7: String = Son las doce
  stableIdentifiers("abc")                        //> res8: String = Prueba
  stableIdentifiers("xyz")                        //> res9: String = Otra cosa

  //Tuple Pattern
  def tuplePattern(any: Any): String = any match {
    case (x, "12:00") => s"Desde las $x a las doce"
    case _            => "Otra cosa"
  }                                               //> tuplePattern: (any: Any)String
  tuplePattern((10, "12:00"))                     //> res10: String = Desde las 10 a las doce
  tuplePattern(45)                                //> res11: String = Otra cosa

  //Constructor Pattern
  case class Persona(nombre: String, edad: Int)

  def constructorPattern(any: Any): String = any match {
    case Persona("abc", 20)   => "Una persona con 20 años de edad"
    case Persona("abc", edad) => s"Una persona con $edad años de edad"
    case _                    => "Otra cosa"
  }                                               //> constructorPattern: (any: Any)String
  constructorPattern(Persona("abc", 20))          //> res12: String = Una persona con 20 aÃ±os de edad
  constructorPattern(Persona("abc", 30))          //> res13: String = Una persona con 30 aÃ±os de edad
  constructorPattern(34)                          //> res14: String = Otra cosa

  //Sequence Pattern
  val sec = Seq(1, 2, 3)                          //> sec  : Seq[Int] = List(1, 2, 3)
  sec.head                                        //> res15: Int = 1
  sec.tail                                        //> res16: Seq[Int] = List(2, 3)

  def sequencePattern(xs: Seq[Int]) = xs match {
    case Seq(1, 2, 3)    => "Valor esperado"
    case Seq(1, _*)      => "La secuencia comienza por 1"
    case Seq(8, _, _, 4) => "La secuencia tiene 4 elementos empieza por 8 y acaba en 4"
    case _               => "Otra secuencia"
  }                                               //> sequencePattern: (xs: Seq[Int])String
  sequencePattern(sec)                            //> res17: String = Valor esperado
  sequencePattern(sec ++ Seq(4))                  //> res18: String = La secuencia comienza por 1
  sequencePattern(Seq(8, 9, 10, 4))               //> res19: String = La secuencia tiene 4 elementos empieza por 8 y acaba en 4
  sequencePattern(Seq())                          //> res20: String = Otra secuencia

  //Recursión
  def longitudSec(l: Seq[Int]): Int = l match {
    case x :: xs => 1 + longitudSec(l.tail)
    case Nil     => 0
  }                                               //> longitudSec: (l: Seq[Int])Int
  longitudSec(sec)                                //> res21: Int = 3

  //Recursión "de cola" y generalización
  import scala.annotation.tailrec
  def longitudSec1[A](l: Seq[A]) = {
    @tailrec
    def loop(xs: Seq[A], acc: Int): Int = xs match {
      case head :: tail => loop(tail, acc + 1)
      case Nil          => acc
    }
    loop(l, 0)
  }                                               //> longitudSec1: [A](l: Seq[A])Int
  longitudSec1(List("1", "2", "3"))               //> res22: Int = 3

  //Pattern binders. Uso de restricciones (pattern guards)
  def patternBinders(p: Persona): String = p match {
    case persona @ Persona(_, 20)           => s"$persona con nombre ${persona.nombre}"
    case persona @ Persona(_, n) if n == 30 => s"$persona con edad $n"
    case _                                  => s"Otra persona: $p"
  }                                               //> patternBinders: (p: patternmatching.Persona)String
  patternBinders(Persona("a", 20))                //> res23: String = Persona(a,20) con nombre a
  patternBinders(Persona("a", 30))                //> res24: String = Persona(a,30) con edad 30
  patternBinders(Persona("a", 35))                //> res25: String = Otra persona: Persona(a,35)

  //Pattern tuples (vals con patrones)
  val (uno, dos) = (1, "2")                       //> uno  : Int = 1
                                                  //| dos  : String = 2
  val (tres, cuatro) = 1 -> "2"                   //> tres  : Int = 1
                                                  //| cuatro  : String = 2
  val (cinco, _) = 1 -> "2"                       //> cinco  : Int = 1
  val (_, seis) = 1 -> "2"                        //> seis  : String = 2
  val List(a, b) = List(1, 2)                     //> a  : Int = 1
                                                  //| b  : Int = 2
  val List(head, _*) = (1 to 10).toList           //> head  : Int = 1

  //Patterns en for comprehensions (bucles y expresiones for)
  val c = (1 to 10).map(i => (i, i)).toList       //> c  : List[(Int, Int)] = List((1,1), (2,2), (3,3), (4,4), (5,5), (6,6), (7,7
                                                  //| ), (8,8), (9,9), (10,10))
  //Sin pattern matching
  for (x <- c) yield x._1 + x._2                  //> res26: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
  //Con pattern matching
  for ((a, b) <- c) yield a + b                   //> res27: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)

}