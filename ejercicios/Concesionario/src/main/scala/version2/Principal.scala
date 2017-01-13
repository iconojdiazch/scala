package version2

import modelo.{ Vehiculo }
import util.Utilidades._
import scala.util.Random
import version2.util.Consultas

object Principal extends App with Consultas{
  val lista = listaVehiculos(Random.nextInt(50))
  println(s"Total:${lista length}\nDetalle:\n${lista.mkString("\n")}")
  
  println(s"El más caro ${masCaro(lista)}")
  
  println("Entre 700€ y 1100€") 
  println(entreDosPrecios(700)(1100)(lista))
  
  println("Entre 500€ y 1000€")
  println(entre500Y1000(lista))
}