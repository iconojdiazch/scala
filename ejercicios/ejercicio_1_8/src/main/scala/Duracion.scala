

class Duracion(val horas: Int = 0, val minutos: Int = 0) {
  val enMinutos = horas * 60 + minutos
  def menos(otro: Duracion): Int = this.enMinutos - otro.enMinutos
  def -(otro: Duracion): Int = menos(otro)
}