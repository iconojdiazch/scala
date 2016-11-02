object metodosimportantes {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(71); 
  println("Welcome to the Scala worksheet");$skip(29); val res$0 = 
  List(1,2,3) ++ List(4,5,6);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(19); val res$1 = 
  Set(1,2,3).toSeq;System.out.println("""res1: Seq[Int] = """ + $show(res$1));$skip(19); val res$2 = 
  Seq(1,2,3).toSet;System.out.println("""res2: scala.collection.immutable.Set[Int] = """ + $show(res$2));$skip(24); val res$3 = 
  Seq(1,2,1,3).distinct;System.out.println("""res3: Seq[Int] = """ + $show(res$3));$skip(22); val res$4 = 
  List(1,2,3).isEmpty;System.out.println("""res4: Boolean = """ + $show(res$4));$skip(19); val res$5 = 
  List(1,2,3).size;System.out.println("""res5: Int = """ + $show(res$5));$skip(26); val res$6 = 
  List(1,2,3).contains(2);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(19); val res$7 = 
  List(1,2,3).head;System.out.println("""res7: Int = """ + $show(res$7));$skip(19); val res$8 = 
  List(1,2,3).tail;System.out.println("""res8: List[Int] = """ + $show(res$8));$skip(19); val res$9 = 
  List(1,2,3).init;System.out.println("""res9: List[Int] = """ + $show(res$9));$skip(22); val res$10 = 
  List(1,2,3).take(2);System.out.println("""res10: List[Int] = """ + $show(res$10));$skip(22); val res$11 = 
  List(1,2,3).drop(2);System.out.println("""res11: List[Int] = """ + $show(res$11));$skip(30); val res$12 = 
  List(1,2,3) zip List(4,5,6);System.out.println("""res12: List[(Int, Int)] = """ + $show(res$12));$skip(53); 
  val mapa = (1 to 10).toList.groupBy { _ % 2 == 0 };System.out.println("""mapa  : scala.collection.immutable.Map[Boolean,List[Int]] = """ + $show(mapa ));$skip(14); val res$13 = 
  mapa(false);System.out.println("""res13: List[Int] = """ + $show(res$13));$skip(13); val res$14 = 
  mapa(true);System.out.println("""res14: List[Int] = """ + $show(res$14))}
}
