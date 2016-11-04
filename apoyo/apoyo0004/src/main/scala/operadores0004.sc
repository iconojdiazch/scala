object operadores {
  println("Welcome to the Scala worksheet")

  //Notación estándar en Java
  "abc def".split(" ")
  
  //Notación infija para métodos con un parámetro
  "abc def" split " "
  
  //Notación postfija para métodos sin parámetros
  "abc def" split " " size
  
  !true
  //Los métodos que comienzan por unary_, seguidos de un símbolo pueden
  //usarse en notación prefija
  true.unary_!
  
  //Igualdad y desigualdad. Scala compara contenidos por defecto, no direcciones de memoria
  //Si queremos otro comportamiento, hay que redefinir equals
  5 == 5
  new String("a") == new String("a")
  new String("a") != new String("a")
  
  //Igualdad y desigualdad con objetos estilo Java
  new String("a") eq new String("a")
  new String("a") ne null
  new String("a") == null
}