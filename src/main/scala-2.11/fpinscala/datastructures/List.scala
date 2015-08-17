package fpinscala.datastructures

import scala.annotation.tailrec

/**
 * Created by masenaga on 17/08/15.
 */
sealed trait List[+A]

case object Nil extends List[Nothing]

case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {
  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case Cons(x, xs) => x + sum(xs)
  }

  def product(ds: List[Double]): Double = ds match {
    case Nil => 1.0
    case Cons(0.0, _) => 0.0
    case Cons(x, xs) => x * product(xs)
  }

  def tail[A](list: List[A]): List[A] = list match {
    //case Nil => throw new RuntimeException("Nil is not allowed")
    case Nil => Nil
    case Cons(_, Nil) => Nil
    case Cons(x, xs) => xs
  }

  def setHead[A](list: List[A], head: A): List[A] = list match {
    case Nil => Nil
    case Cons(_, xs) => Cons(head, xs)
  }

  @tailrec
  def drop[A](list: List[A], n: Int): List[A] = list match {
    //case Nil => throw new RuntimeException("Nil is not allowed")
    case Nil => Nil
    case l if(n == 0) => l
    case Cons(x, xs) if(n > 0) => drop(xs, n-1)
  }

  @tailrec
  def dropWhile[A](list: List[A])(f: A => Boolean): List[A] = list match {
    case Nil => Nil
    case Cons(x, xs) =>
      if(!f(x)) {
        Cons(x, xs)
      } else {
        dropWhile(xs)(f)
      }
  }

  def append[A](a1: List[A], a2: List[A]): List[A] = a1 match {
    case Nil => a2
    case Cons(h,t) => Cons(h, append(t, a2))
  }

  def init[A](l: List[A]): List[A] = l match {
    case Nil => Nil
    case Cons(_,Nil) => Nil
    case Cons(h,t) => Cons(h, init(t))
  }

  def foldRight[A,B](l: List[A], z: B)(f: (A, B) => B): B = l match {
    case Nil => z
    case Cons(x, xs) => f(x, foldRight(xs, z)(f))
  }

  def foldRightMult[A,B](l: List[A], z: B, nulo: B)(f: (A, B) => B): B = l match {
    case Nil => nulo
    case Cons(x, xs) if(x == nulo) => nulo
    case Cons(x, xs) => f(x, foldRightMult(xs, z, nulo)(f))
  }

  def sum2(l: List[Int]) = foldRight(l, 0.0)(_ + _)

  def product2(l: List[Double]) = foldRight(l, 1.0)(_ * _)

  def product3(l: List[Double]) = foldRightMult(l, 1.0, 0.0)(_ * _)

  def apply[A](as: A*): List[A] = {
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))
  }
}

object Test extends App {

  val example = Cons(1, Cons(2, Cons(3, Nil)))
  val example2 = List(1, 2, 3)
  val total = List.sum(example)

  println("example = " + example)
  println("example2 = " + example2)
  println("total = " + total)
}
