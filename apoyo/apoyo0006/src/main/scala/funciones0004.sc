object funciones {
  println("Welcome to the Scala worksheet")

  //La función map transforma valores y, si es necesario, su tipo
  List(1, 2, 3).map(_ * 10)
  List(1, 2, 3).map(elemento => elemento toString)

  //Funciones literales
  val numeros = List(1, 2, 3)
  numeros.map((numero: Int) => numero + 1)
  numeros.map(numero => numero + 1)
  //El _ reprsenta un parámetro. Solo puede emplearse si usamos cada parámetro una vez
  numeros.map(_ + 1)

  //Funciones como valores. El tipo de una función es <functionx>, en donde x representa
  //el número de parámetros
  //Scala tiene funciones de 0 a 22
  val sumar1: Int => Int = numero => numero + 1
  numeros.map(sumar1)
  val sumar2 = (numero: Int) => numero + 1
  numeros.map(sumar2)
  sumar1(8)

  //Métodos como funciones
  class A {
    def metodo(x: Int) = x + 1;
    def metodo1(x: Int, f: Int => Int) = f(x)
    def metodo2: Int => Int = x => x * x
  }
  val a = new A
  val f: Int => Int = a.metodo
  f(7)
  a.metodo1(10, _ * 10)
  val f1: Int => Int = a.metodo2
  f1(2)
}