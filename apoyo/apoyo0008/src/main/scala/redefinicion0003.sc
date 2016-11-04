object redefinicion {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  //Redefinición de métodos
  class Ancestro {
    def m() = "En ancestro"
  }
  class Descendiente extends Ancestro {
    override def m() = "En descendiente"
  }
  new Ancestro().m                                //> res0: String = En ancestro
  new Descendiente().m                            //> res1: String = En descendiente

  val ancestro = new Descendiente()               //> ancestro  : redefinicion.Descendiente = redefinicion$$anonfun$main$1$Descend
                                                  //| iente$1@3f3afe78
  ancestro.m                                      //> res2: String = En descendiente

  //Acceso a métodos heredados del ancestro dentro de métodos redefinidos por el descendiente
  class Ancestro1 {
    def m() = "En ancestro"
  }
  class Descendiente1 extends Ancestro1 {
    override def m() = super.m + " En descendiente"
  }
  new Ancestro1().m                               //> res3: String = En ancestro
  new Descendiente1().m                           //> res4: String = En ancestro En descendiente

  val ancestro1 = new Descendiente1()             //> ancestro1  : redefinicion.Descendiente1 = redefinicion$$anonfun$main$1$Desce
                                                  //| ndiente1$1@7f63425a
  ancestro1.m                                     //> res5: String = En ancestro En descendiente
}