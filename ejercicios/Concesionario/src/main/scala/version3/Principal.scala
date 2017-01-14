package version3

import java.io.PrintStream

import scala.util.Random

import version3.modelo.{ Vehiculo, Coche, Moto }
import java.io.OutputStream
import java.io.FileOutputStream

trait Generator {
  def crearVehiculo(longitudNombre: Int = 10, precioMaximo: Int = 2000): Vehiculo = {
    val nombre = Random.alphanumeric.take(longitudNombre).mkString
    val precio = Random.nextInt(precioMaximo).toDouble
    val flag = Random.nextBoolean()
    if (flag)
      Coche(flag, nombre, precio)
    else
      Moto(flag, nombre, precio)
  }
}
trait Informe {
  def imprimir(xs: Vehiculo*)(implicit out: OutputStream = System out) {
    val output = new PrintStream(out)
    output.println(s"Hay ${xs.size} elementos")
    output.println("Los datos son:")
    xs foreach output.println
  }
}

object Principal extends App with Generator with Informe {
  def desde(n: Vehiculo): Stream[Vehiculo] = n #:: desde(crearVehiculo())
  
  val lista = desde(crearVehiculo()).take(10).toSeq
  imprimir(lista: _*)
  
  implicit val output = new FileOutputStream("test.txt")
  imprimir(lista: _*)  
}