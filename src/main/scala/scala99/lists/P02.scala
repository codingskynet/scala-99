package scala99.lists

import scala.annotation.tailrec

object P02 {
    @tailrec def penultimate[A](list: List[A]): A =
        list match {
            case one :: _ :: Nil => one
            case _ :: next => penultimate(next)
            case _ => throw new NoSuchElementException
        }
}
