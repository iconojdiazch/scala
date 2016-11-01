object caseclases {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(63); 
  println("Welcome to the Scala worksheet");$skip(31); 

  val a = Persona("abc", 20);System.out.println("""a  : Persona = """ + $show(a ));$skip(43); val res$0 = 
  Persona("abc", 20) == Persona("abc", 20);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(30); 

  val b = a.copy(edad = 30);System.out.println("""b  : Persona = """ + $show(b ));$skip(99); val res$1 = 
  b match {
    case Persona(_, edad) if edad < 30 => edad * 10
    case _                => 0
  };System.out.println("""res1: Int = """ + $show(res$1))}
  
  class B(s:String,n:Int) extends Persona(s,n)
  
  //case class B(s:String,n:Int) extends Persona(s,n)
}
