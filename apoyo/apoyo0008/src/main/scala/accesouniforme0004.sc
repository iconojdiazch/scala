object accesouniforme {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  //Principio de acceso uniforme (http://martinfowler.com/bliki/UniformAccessPrinciple.html)
  //Redefinir defs con vala
  //El proceso inverso (vals con defs) no es posible
  class Ancestro {
    def nombre = "El nombre es " + System.currentTimeMillis
  }
  class Descendiente extends Ancestro {
    override val nombre = "El nombre es abc"
  }

  new Ancestro().nombre                           //> res0: String = El nombre es 1478255090085
  new Descendiente().nombre                       //> res1: String = El nombre es abc
}