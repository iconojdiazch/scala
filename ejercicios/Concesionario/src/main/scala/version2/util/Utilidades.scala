package version2.util
import version2.modelo._

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