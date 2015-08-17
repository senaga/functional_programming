package ch03

import fpinscala.datastructures._
import fpinscala.datastructures.List.sum

/**
 * Created by masenaga on 17/08/15.
 */
object exercise01 extends App {

  val x = List(1,2,3,4,5) match {
    case Cons(x, Cons(2, Cons(4, _))) => x
    case Nil => 42
    case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
    case Cons(h, t) => h + sum(t)
    case _ => 101
  }

  println("x = " + x)
}
