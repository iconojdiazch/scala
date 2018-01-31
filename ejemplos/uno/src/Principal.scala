object Principal {
  def main(args:Array[String]){
    val p = List(1,2,3).map( new Persona(_) )
    val p1 = List(1,2,3).map( edad => new Persona(edad) )
    
    val edades = p.map( persona => persona.edad )
    
    println(edades.sortWith(_ > _))
    
    val suma = edades.reduce( (a,b) => a + b )
    val suma1 = edades.reduce ( _ + _ )
    val suma2 = edades.foldLeft(0)((a,b) => a + b)
    val suma3 = edades.foldLeft(0)(_ + _)
    
    println(s"$suma,$suma1,$suma2,$suma3")    
  }
}

class Persona(val edad: Int)