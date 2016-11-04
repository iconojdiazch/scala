object accesouniforme {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  //Principio de acceso uniforme (http://martinfowler.com/bliki/UniformAccessPrinciple.html)
  class Ancestro {
    def nombre = "El nombre es " + System.currentTimeMillis
  }
  class Descendiente extends Ancestro{
    override val nombre = "El nombre es abc"
  }
  
  new Ancestro().nombre                           //> res0: String = El nombre es 1478254394611
  new Descendiente().nombre                       //> res1: String = El nombre es abc
}