object clases {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(26); 
  val a = new ClaseSimple;System.out.println("""a  : ClaseSimple = """ + $show(a ));$skip(34); 
  val b = new ConstructorPrimario;System.out.println("""b  : ConstructorPrimario = """ + $show(b ));$skip(40); 
  val c = new ClaseConParametros("uno");System.out.println("""c  : ClaseConParametros = """ + $show(c ));$skip(46); 
  val d = new ConstructoresAdicionales("xyz");System.out.println("""d  : ConstructoresAdicionales = """ + $show(d ));$skip(39); 
  val e = new ConstructoresAdicionales;System.out.println("""e  : ConstructoresAdicionales = """ + $show(e ));$skip(32); 
  val f = new ValoresInmutables;System.out.println("""f  : ValoresInmutables = """ + $show(f ));$skip(12); val res$0 = 
  f.mensaje;System.out.println("""res0: String = """ + $show(res$0));$skip(30); 
  val g = new ValoresMutables;System.out.println("""g  : ValoresMutables = """ + $show(g ));$skip(12); val res$1 = 
  g.mensaje;System.out.println("""res1: String = """ + $show(res$1));$skip(27); 
  g.mensaje = "Otro valor";$skip(12); val res$2 = 
  g.mensaje;System.out.println("""res2: String = """ + $show(res$2));$skip(174); val res$3 = 
  //Los parámetros no son atributos
  //new PromocionarParametros("000").texto
  //Si los convertimos en vals o vars, entonces sí
  new PromocionarParametrosVal("000").texto;System.out.println("""res3: String = """ + $show(res$3));$skip(44); val res$4 = 
  new PromocionarParametrosVar("111").texto;System.out.println("""res4: String = """ + $show(res$4))}
}
