object patternmatching {
  println("Welcome to the Scala worksheet")

  //Diferentes Match Patterns

  //Wildcard Pattern. Representa algo parecido al default de Java en un switch.
  //Si no lo penmos y no hay un caso que cuadre, MatchError
  val x: String = "abc"
  x match {
    case _ => "Resultado por defecto"
  }

  //Variable Pattern. El identificador (valor en nuestro ejemplo) debe empezar por minúscula
  x match {
    case valor => s"El valor es $valor"
  }

  //Typed Pattern
  import java.util.Date
  def typedPattern(any: Any): String = any match {
    case fecha: Date => s"La fecha es $fecha"
    case _           => s"$any no es una fecha"
  }
  typedPattern("abc")
  typedPattern(new Date)

  //Constant Pattern
  def constantPattern(s: String) = s match {
    case "abc"         => "Valor esperado"
    case "abc" | "def" => "Valor esperado dos"
    case _             => "Valor inesperado"
  }
  constantPattern("abc")
  constantPattern("def")
  constantPattern("1")

  //Stable identifiers pattern: literales, identificadores val o singletones comenzando
  //por mayúscula, o en minúscula entre backticks
  val lasDoce = "12:00"
  object Singleton {
    val test = "abc"
  }
  def stableIdentifiers(any: Any): String = any match {
    case `lasDoce`      => "Son las doce"
    case Singleton.test => "Prueba"
    case _              => "Otra cosa"
  }
  stableIdentifiers("12:00")
  stableIdentifiers("abc")
  stableIdentifiers("xyz")

  //Tuple Pattern
  def tuplePattern(any: Any): String = any match {
    case (x, "12:00") => s"Desde las $x a las doce"
    case _            => "Otra cosa"
  }
  tuplePattern((10, "12:00"))
  tuplePattern(45)

  //Constructor Pattern
  case class Persona(nombre: String, edad: Int)

  def constructorPattern(any: Any): String = any match {
    case Persona("abc", 20)   => "Una persona con 20 años de edad"
    case Persona("abc", edad) => s"Una persona con $edad años de edad"
    case _                    => "Otra cosa"
  }
  constructorPattern(Persona("abc", 20))
  constructorPattern(Persona("abc", 30))
  constructorPattern(34)

  //Sequence Pattern
  val sec = Seq(1, 2, 3)
  sec.head
  sec.tail

  def sequencePattern(xs: Seq[Int]) = xs match {
    case Seq(1, 2, 3)    => "Valor esperado"
    case Seq(1, _*)      => "La secuencia comienza por 1"
    case Seq(8, _, _, 4) => "La secuencia tiene 4 elementos empieza por 8 y acaba en 4"
    case _               => "Otra secuencia"
  }
  sequencePattern(sec)
  sequencePattern(sec ++ Seq(4))
  sequencePattern(Seq(8, 9, 10, 4))
  sequencePattern(Seq())

  //Recursión
  def longitudSec(l: Seq[Int]): Int = l match {
    case x :: xs => 1 + longitudSec(l.tail)
    case Nil     => 0
  }
  longitudSec(sec)

  //Recursión "de cola" y generalización
  import scala.annotation.tailrec
  def longitudSec1[A](l: Seq[A]) = {
    @tailrec
    def loop(xs: Seq[A], acc: Int): Int = xs match {
      case head :: tail => loop(tail, acc + 1)
      case Nil          => acc
    }
    loop(l, 0)
  }
  longitudSec1(List("1", "2", "3"))

  //Pattern binders. Uso de restricciones (pattern guards)
  def patternBinders(p: Persona): String = p match {
    case persona @ Persona(_, 20)           => s"$persona con nombre ${persona.nombre}"
    case persona @ Persona(_, n) if n == 30 => s"$persona con edad $n"
    case _                                  => s"Otra persona: $p"
  }
  patternBinders(Persona("a", 20))
  patternBinders(Persona("a", 30))
  patternBinders(Persona("a", 35))

  //Pattern tuples (vals con patrones)
  val (uno, dos) = (1, "2")
  val (tres, cuatro) = 1 -> "2"
  val (cinco, _) = 1 -> "2"
  val (_, seis) = 1 -> "2"
  val List(a, b) = List(1, 2)
  val List(head, _*) = (1 to 10).toList

  //Patterns en for comprehensions (bucles y expresiones for)
  val c = (1 to 10).map(i => (i, i)).toList
  //Sin pattern matching
  for (x <- c) yield x._1 + x._2
  //Con pattern matching
  for ((a, b) <- c) yield a + b

}