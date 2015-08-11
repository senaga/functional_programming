package ch02

object exercise03 extends App {

  def partial1[A,B,C](a: A, f: (A,B) => C): B => C = {
    val g = f.curried
    g(a)
  }

  def partial2[A,B,C](a: A, f: (A,B) => C): B => C = {
    new Function[B, C] {
      def apply(b: B) = f(a,b)
    }
  }

  def sum(a: Int, b: Int) = a + b

  val g1 = partial1(2, sum)
  println("Teste 1 = " + g1(1))
  println("Teste 2 = " + g1(2))
  println("Teste 3 = " + g1(3))

  val g2 = partial2(2, sum)
  println("Teste 1 = " + g2(1))
  println("Teste 2 = " + g2(2))
  println("Teste 3 = " + g2(3))
}
