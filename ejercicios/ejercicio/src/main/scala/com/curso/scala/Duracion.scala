

package com.curso.scala

case class Duracion(horas: Int = 0, minutos: Int = 0) {
  require(horas >= 0 && horas <= 23, "Las horas deben estar en el rango 0 a 23")
  require(minutos >= 0 && minutos <= 59, "Los minutos deben estar en el rango 0 a 59")
  val enMinutos = horas * 60 + minutos
  def menos(otro: Duracion) = this.enMinutos - otro.enMinutos
  def -(otro: Duracion) = menos(otro)
  override lazy val toString = f"$horas%02d:$minutos%02d"
}

object Duracion {
  def desdeMinutos(minutos: Int) = Duracion(minutos / 60, minutos % 60)
}