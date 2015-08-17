package ch03

import fpinscala.datastructures.List._
import fpinscala.datastructures._

/**
 * Created by masenaga on 17/08/15.
 */
object exercise03 extends App {

  println("drop = " + drop(List(1,2,3,4,5), 1))
  println("drop = " + drop(List(1,2,3,4,5), 2))
  println("drop = " + drop(List(1,2,3,4,5), 3))
  println("drop = " + drop(List(1,2,3,4,5), 4))
  println("drop = " + drop(List(1,2,3,4,5), 5))
  println("drop = " + drop(List(1,2,3,4,5), 6))
  println("drop = " + drop(List(1,2,3), 3))
  println("drop = " + drop(List(1,2,3), 4))
  println("drop = " + drop(List(), 1))
  println("drop = " + drop(Nil, 1))

}
