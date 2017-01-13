package version0

sealed abstract class Vehiculo(val matricula: String, val precio: Double)

case class Coche(airbag: Boolean, override val matricula: String, override val precio: Double) extends Vehiculo(matricula, precio)
case class Moto(sidecar: Boolean, override val matricula: String, override val precio: Double) extends Vehiculo(matricula, precio)

object Utilidades {
  import scala.util.Random
  private def crearVehiculo(longitudNombre: Int = 10, precioMaximo: Int = 2000): Vehiculo = {
    val nombre = Random.alphanumeric.take(longitudNombre).mkString
    val precio = Random.nextInt(precioMaximo).toDouble
    val flag = Random.nextBoolean()
    if (flag)
      Coche(flag, nombre, precio)
    else
      Moto(flag, nombre, precio)
  }
  def listaVehiculos(cuantos: Int): Seq[Vehiculo] =
    for (i <- 1 to cuantos) yield crearVehiculo()
}

object Principal extends App {
  import Utilidades._
  import scala.util.Random
  val lista = listaVehiculos(Random.nextInt(50))
  println(s"Total:${lista length}\nDetalle:\n${lista.mkString("\n")}")
  //  lista foreach println
}