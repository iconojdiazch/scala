object clases {
  println("Welcome to the Scala worksheet")
  val a = new ClaseSimple
  val b = new ConstructorPrimario
  val c = new ClaseConParametros("uno")
  val d = new ConstructoresAdicionales("xyz")
  val e = new ConstructoresAdicionales
  val f = new ValoresInmutables
  f.mensaje
  val g = new ValoresMutables
  g.mensaje
  g.mensaje = "Otro valor"
  g.mensaje
  //Los parámetros no son atributos
  //new PromocionarParametros("000").texto
  //Si los convertimos en vals o vars, entonces sí
  new PromocionarParametrosVal("000").texto
  new PromocionarParametrosVar("111").texto
}