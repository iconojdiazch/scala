package com.curso.scala

class PlanDeVuelo(val aviones: Set[Avion]) {
  val aeropuertos = aviones.flatMap(_.aeropuertos)

  val aeropuertosFor = for {
    x <- aviones
    y <- x.aeropuertos
  } yield y

  def avionesEnAeropuerto(aeropuerto: Aeropuerto) =
    aviones.filter(_.aeropuertos.contains(aeropuerto))

  def avionesEnAeropuertoFor(aeropuerto: Aeropuerto) =
    for {
      x <- aviones if x.aeropuertos.contains(aeropuerto)
    } yield x

  def aterrizaEn(aeropuerto: Aeropuerto) =
    for {
      x <- aviones
      y <- x.itinerario if y._2 == aeropuerto
    } yield (y._1, x)
}