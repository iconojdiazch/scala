package sistema.util

object UtilFuncional {
  type IntToList = Int => List[Int]

  val crearLista: IntToList = 1 to _ toList

  def crearListaRequire(n: Int)(f: IntToList): List[Int] = {
    require(n >= 1, "n debe ser mayor o igual que 1")
    f(n)
  }

  def crearListaOption(n: Int)(f: IntToList): Option[List[Int]] =
    if (n < 1) None else Some(f(n))

  import scala.util.{ Try, Success, Failure }
  def crearListaTry(n: Int)(f: IntToList): Try[List[Int]] = {
    if (n < 1)
      Failure(new IllegalArgumentException("N debe ser mayor o igual que 1"))
    else
      Success(f(n))
  }
}