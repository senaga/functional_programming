package ch03

import fpinscala.datastructures.List._
import fpinscala.datastructures._

/**
 * Created by masenaga on 17/08/15.
 */
object exercise02 extends App {

  println("tail = " + tail(List(1,2,3,4,5)))
  println("tail = " + tail(List(1,2)))
  println("tail = " + tail(List(1)))
  println("tail = " + tail(Nil))

}
