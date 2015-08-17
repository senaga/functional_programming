package ch03

import fpinscala.datastructures.List._
import fpinscala.datastructures._

/**
 * Created by masenaga on 17/08/15.
 */
object exercise07 extends App {
  println("foldRightMult = " + foldRightMult(List(1,0,3,4,5), 1, 0)(_*_))
  println("foldRightMult = " + foldRightMult(List(1,2,0,4), 1, 0)(_*_))
  println("foldRightMult = " + foldRightMult(List(1,0,3), 1, 0)(_*_))
  println("foldRightMult = " + foldRightMult(List(1,0), 1, 0)(_*_))
  println("foldRightMult = " + foldRightMult(List(1), 1, 0)(_*_))
  println("foldRightMult = " + foldRightMult[Int, Int](List(), 1, 0)(_*_))
  println("foldRightMult = " + foldRightMult[Int, Int](Nil, 1, 0)(_*_))
}
