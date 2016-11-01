object operadores {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(63); 
  println("Welcome to the Scala worksheet");$skip(54); val res$0 = 

  //Notación estándar en Java
  "abc def".split(" ");System.out.println("""res0: Array[String] = """ + $show(res$0));$skip(75); val res$1 = 
  
  //Notación infija para métodos con un parámetro
  "abc def" split " ";System.out.println("""res1: Array[String] = """ + $show(res$1));$skip(80); val res$2 = 
  
  //Notación postfija para métodos sin parámetros
  "abc def" split " " size;System.out.println("""res2: Int = """ + $show(res$2));$skip(11); val res$3 = 
  
  !true;System.out.println("""res3: Boolean = """ + $show(res$3));$skip(118); val res$4 = 
  //Los métodos que comienzan por unary_, seguidos de un símbolo pueden
  //usarse en notación prefija
  true.unary_!;System.out.println("""res4: Boolean = """ + $show(res$4));$skip(166); val res$5 = 
  
  //Igualdad y desigualdad. Scala compara contenidos por defecto, no direcciones de memoria
  //Si queremos otro comportamiento, hay que redefinir equals
  5 == 5;System.out.println("""res5: Boolean(true) = """ + $show(res$5));$skip(37); val res$6 = 
  new String("a") == new String("a");System.out.println("""res6: Boolean = """ + $show(res$6));$skip(37); val res$7 = 
  new String("a") != new String("a");System.out.println("""res7: Boolean = """ + $show(res$7));$skip(91); val res$8 = 
  
  //Igualdad y desigualdad con objetos estilo Java
  new String("a") eq new String("a");System.out.println("""res8: Boolean = """ + $show(res$8));$skip(26); val res$9 = 
  new String("a") ne null;System.out.println("""res9: Boolean = """ + $show(res$9));$skip(26); val res$10 = 
  new String("a") == null;System.out.println("""res10: Boolean = """ + $show(res$10))}
}
