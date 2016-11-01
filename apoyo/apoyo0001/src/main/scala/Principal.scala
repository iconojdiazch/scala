import apoyo0001.Persona
import apoyo0001.PersonaScala

object Principal extends App {
  val personaJava = new Persona("a", "b")
  println(personaJava.getNombre())
  
  val personaScala = new PersonaScala("c", "d")
  println(personaScala.nombre)
  
  val s = "Inferencia de tipos"
  println(s)
  
  val funcion: String => String = s => s.toUpperCase()
  println(funcion("uno"))
}