object Principal5 extends App {
  trait Printer[A] {
    def print(x: A): String
  }

  object Printer {
    def apply[A: Printer]: Printer[A] = implicitly
  }

  case class Caja(contenido: String)

  implicit object CajaPrinter extends Printer[Caja] {
    def print(x: Caja) = x.contenido
  }

  def test[A: Printer](cosa: A) = Printer[A].print(cosa)

  val r = test(Caja("abc"))
  println(r)
  println(Caja("def").print)

  implicit class PrinterOps[A: Printer](cosa: A) {
    def print = Printer[A].print(cosa)
  }

  implicit object IntPrinter extends Printer[Int] {
    def print(x: Int) = x.toString
  }
  def test1[A: Printer](cosa: A) = cosa.print

  println(test1(18))
  println(25.print)
}