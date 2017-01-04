package sistema

import scala.concurrent.ExecutionContext.Implicits.global

object Principal3 extends App {
  println("Creando los futuros...")
  val resultado1 = ejecutar(10)
  val resultado2 = ejecutar(20)
  val resultado3 = ejecutar(30)

  println("Antes de la for-comprehension")
  val result = for {
    r1 <- resultado1
    r2 <- resultado2
    r3 <- resultado3
  } yield (r1 + r2 + r3)

  println("Antes de foreach")
  result.foreach { x => println(s"total = $x") }

  println("Antes de dormir...")
  dormir(2000)
}