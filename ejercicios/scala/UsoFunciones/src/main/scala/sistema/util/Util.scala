package sistema.util

object Util {
  def crearLista(n: Int): List[Int] = 1 to n toList
  def crearListaRequire(n: Int): List[Int] = {
    require(n >= 1, "n debe ser mayor o igual que 1")
    1 to n toList
  }
  def crearListaOption(n: Int): Option[List[Int]] =
    if (n < 1) None else Some(1 to n toList)

  import scala.util.{ Try, Success, Failure }
  def crearListaTry(n: Int): Try[List[Int]] = {
    if (n < 1)
      Failure(new IllegalArgumentException("N debe ser mayor o igual que 1"))
    else
      Success(1 to n toList)
  }
}