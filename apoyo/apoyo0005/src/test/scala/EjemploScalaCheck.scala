import collection.mutable.ArrayStack
import org.scalatest._

class ExampleSpec extends FlatSpec with Matchers {

  "Un ArrayStack" should "extraer valores en orden last-in-first-out" in {
    val stack = new ArrayStack[Int]
    stack.push(1)
    stack.push(2)
    stack.pop() should be (2)
    stack.pop() should be (1)
  }

  it should "lanzar una RuntimeException si se usa pop en un ArrayStack sin contenido" in {
    val emptyStack = new ArrayStack[Int]
    a [RuntimeException] should be thrownBy {
      emptyStack.pop()
    } 
  }
}