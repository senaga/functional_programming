package ch03

import fpinscala.datastructures.List._
import fpinscala.datastructures._

/**
 * Created by masenaga on 17/08/15.
 */
object exercise06 extends App {

  println("init = " + init(List(1,2,3,4,5)))
  println("init = " + init(List(2,3,4,5)))
  println("init = " + init(List(3,4,5)))
  println("init = " + init(List(4,5)))
  println("init = " + init(List(5)))
  println("init = " + init(List()))
  println("init = " + init(Nil))
}
