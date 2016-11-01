object caseclases {
  println("Welcome to the Scala worksheet")

  val a = Persona("abc", 20)
  Persona("abc", 20) == Persona("abc", 20)

  val b = a.copy(edad = 30)
  b match {
    case Persona(_, edad) if edad < 30 => edad * 10
    case _                => 0
  }
  
  class B(s:String,n:Int) extends Persona(s,n)
  
  //case class B(s:String,n:Int) extends Persona(s,n)
}