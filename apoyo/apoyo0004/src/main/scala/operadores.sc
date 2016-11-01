object operadores {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  //Notación estándar en Java
  "abc def".split(" ")                            //> res0: Array[String] = Array(abc, def)
  
  //Notación infija para métodos con un parámetro
  "abc def" split " "                             //> res1: Array[String] = Array(abc, def)
  
  //Notación postfija para métodos sin parámetros
  "abc def" split " " size                        //> res2: Int = 2
  
  !true                                           //> res3: Boolean = false
  //Los métodos que comienzan por unary_, seguidos de un símbolo pueden
  //usarse en notación prefija
  true.unary_!                                    //> res4: Boolean = false
  
  //Igualdad y desigualdad. Scala compara contenidos por defecto, no direcciones de memoria
  //Si queremos otro comportamiento, hay que redefinir equals
  5 == 5                                          //> res5: Boolean(true) = true
  new String("a") == new String("a")              //> res6: Boolean = true
  new String("a") != new String("a")              //> res7: Boolean = false
  
  //Igualdad y desigualdad con objetos estilo Java
  new String("a") eq new String("a")              //> res8: Boolean = false
  new String("a") ne null                         //> res9: Boolean = true
  new String("a") == null                         //> res10: Boolean = false
}