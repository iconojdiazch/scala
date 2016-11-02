object instanciacion {
  println("Welcome to the Scala worksheet")
  Array(1, 2, 3)
  Seq("a", "b", "c")
  Set(1, 2, 2, 3)
  Map(1 -> "uno", 2 -> "dos", 2 -> "tres")
  Set(1,2,"3")
  
  //Cada clase de tipo colección está asociada a un companion object, el cual
  //tiene una función llamada apply que es la que crea realmente el objeto, esto es,
  //apply es un método de factoría
  Vector(1,2,3)
  //Esto nos permitiría escribir
  Vector.apply(1,2,3)
}