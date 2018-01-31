package sistema

import modelo.Persona
import utilidades.UtilLista._

object Principal {
  def main(args:Array[String]){    
    val suma = crearListaPersonas(3) reduce((p1,p2) => Persona(p1.edad + p2.edad))      
    println(s"El resultado es ${suma.edad}")
    val suma1 = crearListaPersonasVal(3).foldLeft(Persona(0))((p1,p2) => Persona(p1.edad + p2.edad))      
    println(s"El resultado es ${suma1.edad}")    
  }
}

