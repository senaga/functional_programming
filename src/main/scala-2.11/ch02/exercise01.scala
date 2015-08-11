package ch02

object exercise01 extends App {

  def fib(n: Int): Int = {
    if(n <= 1) n
    else fib(n-1) + fib(n-2)
  }

  def fib2( n : Int) : Int = {
    def loop(n: Int, a: Int, b: Int): Int = n match {
      case 0 => a
      case _ => loop(n-1, b, a+b)
    }
    loop( n, 0, 1)
  }

  println("Fib1")
  (0 to 5).foreach(n => println(s"f($n) = " + fib(n)))
  println("\nFib2")
  (0 to 5).foreach(n => println(s"f($n) = " + fib2(n)))
}
