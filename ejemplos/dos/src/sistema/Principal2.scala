package sistema

import modelo.Persona

object Principal2 {
  def main(args:Array[String]){
    val p = List(1,2,3).view.map( Persona(_) )
   
    val edades = p.map( persona => persona.edad )
    
    val suma = edades.reduce( (a,b) => a + b )
    
    println(suma)
  }
}
