package utilidades

import modelo.Persona

object UtilLista {
  private def crearLista(n:Int) = 1 to n toList
  def crearListaPersonas(n:Int) = crearLista(n) map(Persona(_))
  val crearListaPersonasVal: Int => List[Persona] = crearLista(_) map(Persona(_))
}