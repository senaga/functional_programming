package ch02

object exercise02 extends App {

  //def isSorted[@specialized A](as: Array[A], gt: (A,A) => Boolean): Boolean = {
  def isSorted[A](as: Array[A], gt: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def go(as: Array[A], pos: Int): Boolean = {
      if(as.length <= 1 || pos >= as.length-1) true
      else {
        if (gt(as(pos), as(pos + 1))) false
        else go(as, pos + 1)
      }
    }
    go(as, 0)
  }

  val a1: Array[Int] = new Array[Int](5)
  a1(0) = 1; a1(1) = 2; a1(2) = 3; a1(3) = 4; a1(4) = 5  // True
  println("isSorted = " + isSorted(a1, (n1: Int, n2: Int) => n1 > n2))

  a1(0) = 1; a1(1) = 2; a1(2) = 10; a1(3) = 4; a1(4) = 5  // False
  println("isSorted = " + isSorted(a1, (n1: Int, n2: Int) => n1 > n2))

  a1(0) = 1; a1(1) = 2; a1(2) = 3; a1(3) = 3; a1(4) = 5  // True
  println("isSorted = " + isSorted(a1, (n1: Int, n2: Int) => n1 > n2))

  a1(0) = 1; a1(1) = 2; a1(2) = 3; a1(3) = 3; a1(4) = 50  // True
  println("isSorted = " + isSorted(a1, (n1: Int, n2: Int) => n1 > n2))

  a1(0) = 10; a1(1) = 2; a1(2) = 3; a1(3) = 3; a1(4) = 50  // False
  println("isSorted = " + isSorted(a1, (n1: Int, n2: Int) => n1 > n2))

  println("isSorted = " + isSorted(new Array[Int](0), (n1: Int, n2: Int) => n1 > n2))
  println("isSorted = " + isSorted(new Array[Int](1), (n1: Int, n2: Int) => n1 > n2))
  println("isSorted = " + isSorted(new Array[Int](2), (n1: Int, n2: Int) => n1 > n2))
}
