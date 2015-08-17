package ch03

import fpinscala.datastructures.List._
import fpinscala.datastructures._

/**
 * Created by masenaga on 17/08/15.
 */
object exercise04 extends App {

  println("dropWhile = " + dropWhile(List(1,2,3,4,5))(_ <= 1))
  println("dropWhile = " + dropWhile(List(1,2,3,4,5))(_ <= 2))
  println("dropWhile = " + dropWhile(List(1,2,3,4,5))(_ <= 3))
  println("dropWhile = " + dropWhile(List(1,2,3,4,5))(_ <= 4))
  println("dropWhile = " + dropWhile(List(1,2,3,4,5))(_ <= 5))
  println("dropWhile = " + dropWhile(List(1,2,3,4,5))(_ <= 6))
  println("dropWhile = " + dropWhile(List(1,2,3))(_ <= 1))
  println("dropWhile = " + dropWhile(List(1,2,3))(_ <= 2))
  println("dropWhile = " + dropWhile[Int](List())(_ <= 1))
  println("dropWhile = " + dropWhile[Int](Nil)(_ <= 1))
  println("dropWhile = " + dropWhile(List())(i => true))
  println("dropWhile = " + dropWhile(Nil)(i => true))
}
