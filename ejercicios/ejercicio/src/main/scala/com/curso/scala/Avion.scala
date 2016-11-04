

package com.curso.scala

case class Avion(tipo: String, numero: Int, itinerario: Seq[(Duracion, Aeropuerto)]) {
  require(itinerario.size >= 2, "Al menos dos elementos")
  val aeropuertos = itinerario.map(_._2)
  val aeropuertosFor = for ((_, b) <- itinerario) yield b
}