object traits {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  //Problemas. Necesitaríamos herencia múltiple
  class Animal
  class Pajaro extends Animal {
    def volar = ???
  }
  class Pez extends Animal {
    def nadar = ???
    def desovar = ???
  }
  class Pato extends Animal {
    def volar = ???
    def nadar = ???
    def caminar = ???
  }

  //Con trais
  class Animal1
  trait Nadador {
    def nadar = ???
  }
  class Pajaro1 extends Animal1 {
    def volar = ???
  }
  class Pez1 extends Animal1 with Nadador {
    def desovar = ???
  }
  class Pato1 extends Pajaro1 with Nadador {
    def caminar = ???
  }
  
  //Una clase puede "descender" de un trait
  trait A  //extends AnyRef //Opcional
  trait B
  class C extends A
  class D extends A with B
  class E extends C with B
  object F extends C
  object G extends A
  object H extends A with B
}