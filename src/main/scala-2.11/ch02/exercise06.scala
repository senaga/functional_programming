package ch02

object exercise06 extends App {

  def compose[A,B,C](f: B => C, g: A => B): A => C = { (a) => f(g(a)) }

  def appendOne(a: String) = "Hello " + a
  def appendTwo(a: String) = a + " Bye "

  val g = compose(appendTwo, appendOne)
  val x = g("Marcelo")

  println("Result = " + x)
}
