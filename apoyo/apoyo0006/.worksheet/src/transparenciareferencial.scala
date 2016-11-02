object transparenciareferencial {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(77); 
  println("Welcome to the Scala worksheet");$skip(38); 
  val x = "Transparencia Referencial";System.out.println("""x  : String = """ + $show(x ));$skip(21); 
  val r1 = x.reverse;System.out.println("""r1  : String = """ + $show(r1 ));$skip(21); 
  val r2 = x.reverse;System.out.println("""r2  : String = """ + $show(r2 ));$skip(136); 
  //Ahora sustituimos el término x por la expresión a la que se refiere (su defiinición)
  val r3 = "Transparencia Referencial".reverse;System.out.println("""r3  : String = """ + $show(r3 ));$skip(47); 
  val r4 = "Transparencia Referencial".reverse;System.out.println("""r4  : String = """ + $show(r4 ));$skip(114); 
  //No se observa ningún cambio en el funcionamiento del programa
  
  val y = new StringBuilder("Transparencia");System.out.println("""y  : StringBuilder = """ + $show(y ));$skip(36); 
  val y1 = y.append(" Referencial");System.out.println("""y1  : StringBuilder = """ + $show(y1 ));$skip(23); 
  val y2 = y1.toString;System.out.println("""y2  : String = """ + $show(y2 ));$skip(23); 
  val y3 = y1.toString;System.out.println("""y3  : String = """ + $show(y3 ));$skip(116); 
  //Llevamos a cabo la sustitución de y1 por su definición, como antes
  val y4 = y.append(" Referencial").toString;System.out.println("""y4  : String = """ + $show(y4 ));$skip(45); 
  val y5 = y.append(" Referencial").toString;System.out.println("""y5  : String = """ + $show(y5 ))}
  //El comportamiento del programa cambia. Problema: hemos mutado el StringBuilder in place
  
}
