object redefinicion {
  println("Welcome to the Scala worksheet")

  //Redefinición de métodos
  class Ancestro {
    def m() = "En ancestro"
  }
  class Descendiente extends Ancestro {
    override def m() = "En descendiente"
  }
  new Ancestro().m
  new Descendiente().m

  val ancestro: Ancestro = new Descendiente()
  ancestro.m

  //Acceso a métodos heredados del ancestro dentro de métodos redefinidos por el descendiente
  class Ancestro1 {
    def m() = "En ancestro"
  }
  class Descendiente1 extends Ancestro1 {
    override def m() = super.m + " En descendiente"
  }
  new Ancestro1().m
  new Descendiente1().m

  val ancestro1: Ancestro1 = new Descendiente1()
  ancestro1.m
}