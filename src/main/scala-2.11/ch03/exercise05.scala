package ch03

import fpinscala.datastructures.List._
import fpinscala.datastructures._

/**
 * Created by masenaga on 17/08/15.
 */
object exercise05 extends App {

  println("setHead = " + setHead(List(1,2,3,4,5), 10))
  println("setHead = " + setHead(List(2,3,4,5), 10))
  println("setHead = " + setHead(List(3,4,5), 10))
  println("setHead = " + setHead(List(4,5), 10))
  println("setHead = " + setHead(List(5), 10))
  println("setHead = " + setHead(List(), 10))
  println("setHead = " + setHead(Nil, 10))
}
