//Conversión implícita
object Principal2 extends App {
  implicit def conversion(n: Int) = s"00$n"
  def mensaje(nombre: String) = s"Hola $nombre"
  val r = mensaje(7)
  println(r)
}
//Clase implícita
object Principal3 extends App{
  implicit class Agente(n:Int){
    def code = s"00$n"
  }
  def mensaje(a: Agente) = s"Hola ${a.code}"
  println(mensaje(8))  
}