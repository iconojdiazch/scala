package sistema

import util.Util._
object Principal extends App {
  println("Se crean dos listas, la intermedia y la final")
  crearLista(10) map (_ + 1) map (_ * 10) foreach println

  println("Se crea una sola lista")
  val sumarUno: Int => Int = _ + 1
  val multiplicarPorDiez: Int => Int = _ * 10
  val composicion = sumarUno andThen multiplicarPorDiez
  val composicion1 = sumarUno compose multiplicarPorDiez
  crearLista(10) map (composicion(_)) foreach println

  import util.UtilFuncional._
  crearListaOption(10)(crearLista) foreach println
  println("Otro ejemplo...")
  import scala.util.Random
  val nuevoCrearLista: IntToList = n => Random.shuffle(crearLista(n))
  val complejo = nuevoCrearLista(5) map (crearLista(_))
  complejo foreach println
  println("Fin")
} 
