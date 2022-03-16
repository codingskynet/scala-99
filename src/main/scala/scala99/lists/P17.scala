package scala99.lists

import scala.annotation.tailrec

object P17 {
    def split[A](n: Int, list: List[A]): (List[A], List[A]) =
        list.splitAt(n)

    def tailrecSplit[A](n: Int, list: List[A]): (List[A], List[A]) = {
        @tailrec def local_split(left: List[A], right: List[A]): (List[A], List[A]) = {
            if (left.length == n) return (left.reverse, right)

            right match {
                case head :: next => local_split(head :: left, next)
                case Nil => (left.reverse, right)
            }
        }

        local_split(Nil, list)
    }

    def functionalSplit[A](n: Int, list: List[A]): (List[A], List[A]) =
        (list.take(n), list.drop(n))
}
