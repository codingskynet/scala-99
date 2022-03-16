package scala99.lists

import scala.annotation.tailrec

object P18 {
    def slice[A](from: Int, to: Int, list: List[A]): List[A] =
        list.slice(from, to)

    def tailrecSlice[A](from: Int, to: Int, list: List[A]): List[A] = {
        @tailrec def local_slice(idx: Int, result: List[A], list: List[A]): List[A] =
            list match {
                case head :: next =>
                    if (idx >= from && idx < to)
                        local_slice(idx + 1, head :: result, next)
                    else
                        local_slice(idx + 1, result, next)
                case Nil => result.reverse
            }

        local_slice(0, Nil, list)
    }

    def functionalSlice[A](from: Int, to: Int, list: List[A]): List[A] =
        list.drop(from).take(math.max(to - from, 0))
}
