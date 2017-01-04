package sistema
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.Success
import scala.util.Failure

object Principal4 extends App {
  val f1 = Future { 1 / 0 } fallbackTo Future { 42 }
  f1 foreach println

  val f2 = Future { 1 / 0 }.recover {
    case e: ArithmeticException => 0
  }
  f2 map (valor => println(s"Resultado: $valor"))

  val f3 = Future { 1 / 0 } recoverWith {
    case e: ArithmeticException => Future { 0 }
  }

  val r1 = Future { 10 }
  val r2 = Future { 20 }
  val lista = List(r1, r2)
  val r3 = lista flatMap (_.value)
  val r4 = lista filter (_.isCompleted)

  val r5 = Future { 10 } andThen {
    case Success(n)  => println(s"Valor: $n")
    case Failure(ex) => println(ex)
  }
}