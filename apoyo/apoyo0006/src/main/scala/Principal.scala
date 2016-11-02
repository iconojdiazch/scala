import java.util.Arrays._

object Principal extends App {
  println("Programa principal")
  import apoyo0006._
  println("Lista transformada desde Java")
  println(new TransformarLista().transformar(asList(1, 2, 3)))
  println("Lista transformada desde Scala")
  List(1, 2, 3).map(_ * 10).map(_ + 1).foreach(println)
}