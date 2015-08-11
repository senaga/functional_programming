package ch02

object exercise04 extends App {

  def curry1[A,B,C](f: (A, B) => C): A => (B => C) = f.curried

  def curry2[A,B,C](f: (A, B) => C): A => (B => C) = {
    new Function[A, B => C] {
      def apply(a: A): (B => C) = {
        new Function[B, C] {
          def apply(b: B): C = f(a, b)
        }
      }
    }
  }

  def append(a: String, b: String) = a + b

  val g = curry2(append)

  println("Teste 1 = " + g("Hello")(",World"))
  println("Teste 2 = " + g("Hello")(",Mother"))
  println("Teste 3 = " + g("Hello")(",Father"))
}
