/*
 * Chequear esta documentación
 * http://eed3si9n.com/implicit-parameter-precedence-again
 */
object Principal1 extends App {
  def saludo(implicit texto: String, codigo: Int) = s"Mensaje: $texto. Info: $codigo"
 
  println(saludo("uno", 2))

  implicit val c = 7
  implicit val t = "Hola"
  println(saludo)

  println("Fin")
} 
