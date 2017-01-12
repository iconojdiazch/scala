object metodosimportantes {
  println("Welcome to the Scala worksheet")
  List(1,2,3) ++ List(4,5,6)
  Set(1,2,3).toSeq
  Seq(1,2,3).toSet
  Seq(1,2,1,3).distinct
  List(1,2,3).isEmpty
  List(1,2,3).size
  List(1,2,3).contains(2)
  List(1,2,3).head
  List(1,2,3).tail
  List(1,2,3).init
  List(1,2,3).take(2)
  List(1,2,3).drop(2)
  List(2,1,3).sorted
  List(2,1,3).sortWith(_ < _)
  List(2,1,3).sortWith(_ > _)
  case class Persona(nombre:String) extends Ordered[Persona]{
   def compare (that: Persona) = {
        if (this.nombre == that.nombre) 0 else if (this.nombre > that.nombre) 1 else -1
    }
  }
  import scala.util.Random
  val desordenada = Random.shuffle(('a' to 'j').toList.map(_.toString))
  val ordenada = desordenada.map(Persona(_)).sorted
  val a = List(1,2,3) zip List(4,5,6)
  a unzip
  val mapa = (1 to 10).toList.groupBy { _ % 2 == 0 }
  mapa(false)
  mapa(true)
}