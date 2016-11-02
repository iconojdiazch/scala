object funciones {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  println("Welcome to the Scala worksheet");$skip(96); val res$0 = 

  //La función map transforma valores y, si es necesario, su tipo
  List(1, 2, 3).map(_ * 10);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(51); val res$1 = 
  List(1, 2, 3).map(elemento => elemento toString);System.out.println("""res1: List[String] = """ + $show(res$1));$skip(56); 

  //Funciones literales
  val numeros = List(1, 2, 3);System.out.println("""numeros  : List[Int] = """ + $show(numeros ));$skip(43); val res$2 = 
  numeros.map((numero: Int) => numero + 1);System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(36); val res$3 = 
  numeros.map(numero => numero + 1);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(108); val res$4 = 
  //El _ reprsenta un parámetro. Solo puede emplearse si usamos cada parámetro una vez
  numeros.map(_ + 1);System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(203); 

  //Funciones como valores. El tipo de una función es <functionx>, en donde x representa
  //el número de parámetros
  //Scala tiene funciones de 0 a 22
  val sumar1: Int => Int = numero => numero + 1;System.out.println("""sumar1  : Int => Int = """ + $show(sumar1 ));$skip(22); val res$5 = 
  numeros.map(sumar1);System.out.println("""res5: List[Int] = """ + $show(res$5));$skip(43); 
  val sumar2 = (numero: Int) => numero + 1;System.out.println("""sumar2  : Int => Int = """ + $show(sumar2 ));$skip(22); val res$6 = 
  numeros.map(sumar2);System.out.println("""res6: List[Int] = """ + $show(res$6));$skip(12); val res$7 = 
  sumar1(8)

  //Métodos como funciones
  class A {
    def metodo(x: Int) = x + 1;
    def metodo1(x: Int, f: Int => Int) = f(x)
    def metodo2: Int => Int = x => x * x
  };System.out.println("""res7: Int = """ + $show(res$7));$skip(180); 
  val a = new A;System.out.println("""a  : funciones.A = """ + $show(a ));$skip(31); 
  val f: Int => Int = a.metodo;System.out.println("""f  : Int => Int = """ + $show(f ));$skip(7); val res$8 = 
  f(7);System.out.println("""res8: Int = """ + $show(res$8));$skip(24); val res$9 = 
  a.metodo1(10, _ * 10);System.out.println("""res9: Int = """ + $show(res$9));$skip(33); 
  val f1: Int => Int = a.metodo2;System.out.println("""f1  : Int => Int = """ + $show(f1 ));$skip(8); val res$10 = 
  f1(2);System.out.println("""res10: Int = """ + $show(res$10))}
}
