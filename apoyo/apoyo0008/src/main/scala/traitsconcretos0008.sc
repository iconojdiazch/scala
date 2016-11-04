object traitsconcretos {
  println("Welcome to the Scala worksheet")

  object Uno {
    trait A {
      def m = "trait A"
    }
    trait B {
      def n = "trait B"
    }

    class C extends A with B
    val c1 = new C().m
    val c2 = new C().n
  }
  Uno.c1
  Uno.c2

  object Dos {
    trait A {
      def m = "trait A"
    }
    trait B {
      def m = "trait B"
    }

    //Error. Scala no puede distinguir entre los dos métodos "m"
    //class C extends A with B
  }
  object Tres {
    trait A {
      def m = "trait A"
    }
    trait B extends A {
      override def m = super.m + " trait B"
    }

    class C extends B {
      override def m = super.m + " clase C"
    }
    val c1 = new C().m
  }
  Tres.c1
}