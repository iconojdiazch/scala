package version2.modelo

sealed trait Vehiculo {
  def matricula: String
  def precio: Double
}

case class Coche(airbag: Boolean, matricula: String, precio: Double) extends Vehiculo
case class Moto(sidecar: Boolean, matricula: String, precio: Double) extends Vehiculo
