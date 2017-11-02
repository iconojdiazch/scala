import scala.collection.generic.FilterMonadic

object Principal extends App {
  println("Reducciones".toUpperCase)
  val lista = (1 to 10).toList
  assert(lista.sum == 55)
  assert(lista.fold(0)((a, b) => a + b) == 55)
  assert(lista.foldLeft(0)((a, b) => a + b) == 55)
  assert(lista.foldRight(0)((a, b) => a + b) == 55)
  assert(lista.reduce((a, b) => a + b) == 55)
  assert(lista.reduceLeft((a, b) => a + b) == 55)
  assert(lista.reduceRight((a, b) => a + b) == 55)
  println("Filtros".toUpperCase)
  assert(lista.filter(n => n % 2 == 0) == List(2, 4, 6, 8, 10))
  val l: FilterMonadic[Int, List[Int]] = lista.withFilter(n => n % 2 == 0)
  assert(l.map(identity(_)) == List(2, 4, 6, 8, 10))
  println("Uso de map".toUpperCase)
  assert(lista.map(n => (n, n * n)) == List((1, 1), (2, 4), (3, 9), (4, 16), (5, 25), (6, 36), (7, 49), (8, 64), (9, 81), (10, 100)))
  assert(lista.map(n => (n, n * n)).toMap == Map(5 -> 25, 10 -> 100, 1 -> 1, 6 -> 36, 9 -> 81, 2 -> 4, 7 -> 49, 3 -> 9, 8 -> 64, 4 -> 16))
  println("Uso de zip".toUpperCase)
  assert(lista.zip(lista) == List((1, 1), (2, 2), (3, 3), (4, 4), (5, 5), (6, 6), (7, 7), (8, 8), (9, 9), (10, 10)))
  assert(lista.zipWithIndex == List((1, 0), (2, 1), (3, 2), (4, 3), (5, 4), (6, 5), (7, 6), (8, 7), (9, 8), (10, 9)))
  println("Grupos y particiones".toUpperCase)
  val f: Int => Boolean = _ % 2 == 0
  val grupo = lista groupBy f
  assert(grupo == Map(false -> List(1, 3, 5, 7, 9), true -> List(2, 4, 6, 8, 10)))
  val particion = lista partition f
  assert(particion == (List(2, 4, 6, 8, 10), List(1, 3, 5, 7, 9)))
  val (l1, l2) = particion
  assert(l1 == List(2, 4, 6, 8, 10))
  assert(l2 == List(1, 3, 5, 7, 9))
  println("Uso de flatMap".toUpperCase)
  import scala.util.Random
  def f1(x: Int) = if (x > 5) Some(x) else None
  val desordenada = Random.shuffle(lista)
  val lMap = desordenada.map(f1)
  println(s"Usando map --> $lMap")
  val fMap = desordenada.flatMap(f1)
  println(s"Usando flatMap --> $fMap")
  println("Uso de collect".toUpperCase)
  assert(List(2, None, 6, Unit, null).collect { case i: Int => i } == List(2, 6))
  println("Uso de un iterador".toUpperCase)
  lista.iterator foreach println
  println("Leer archivo 'test.txt' y mostrar su contenido por consola".toUpperCase)
  import scala.io.Source
  Source.fromFile("test.txt").getLines.foreach(println)
  println("Mostrar las 10 primeras líneas".toUpperCase)
  Source.fromFile("test.txt").getLines.take(10).foreach(println)
  println("Fin")
} 
