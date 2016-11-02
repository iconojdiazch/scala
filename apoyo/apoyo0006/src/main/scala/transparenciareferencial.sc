object transparenciareferencial {
  println("Welcome to the Scala worksheet")
  val x = "Transparencia Referencial"
  val r1 = x.reverse
  val r2 = x.reverse
  //Ahora sustituimos el término x por la expresión a la que se refiere (su defiinición)
  val r3 = "Transparencia Referencial".reverse
  val r4 = "Transparencia Referencial".reverse
  //No se observa ningún cambio en el funcionamiento del programa
  
  val y = new StringBuilder("Transparencia")
  val y1 = y.append(" Referencial")
  val y2 = y1.toString
  val y3 = y1.toString
  //Llevamos a cabo la sustitución de y1 por su definición, como antes
  val y4 = y.append(" Referencial").toString
  val y5 = y.append(" Referencial").toString
  //El comportamiento del programa cambia. Problema: hemos mutado el StringBuilder in place
  
}