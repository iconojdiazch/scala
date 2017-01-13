package version2.util

import version2.modelo.{ Vehiculo }

trait Consultas {
  val masCaro: Seq[Vehiculo] => Vehiculo = seq => seq.maxBy(_.precio)
  val entre500Y1000: Seq[Vehiculo] => Seq[Vehiculo] = seq => entreDosPrecios(500)(1000)(seq)
  val entreDosPrecios: Double => Double => Seq[Vehiculo] => Seq[Vehiculo] =
    minimo => maximo => seq => seq.filter(v => v.precio >= minimo && v.precio <= maximo)
}