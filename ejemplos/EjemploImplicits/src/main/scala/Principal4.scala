object Principal4 extends App {
  trait Printer[T] {
    def print(t: T): String
  }
  object Printer {
    implicit val pInt = new Printer[Int] {
      def print(t: Int) = t.toString
    }
  }
  def test[A](t: A)(implicit p: Printer[A]) = p.print(t)
  val r = test(18)
  println(r)
  def test1[A: Printer](t: A) = implicitly[Printer[A]].print(t)
  val r1 = test1(20)
  println(r1)
  //  test(3.0d)
}