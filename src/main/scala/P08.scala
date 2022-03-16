import scala.annotation.tailrec

object P08 {
    def compress[A](list: List[A]): List[A] =
        list match {
            case head :: next => head :: compress(next.dropWhile(_ == head))
            case Nil => Nil
        }

    def tailrecCompress[A](list: List[A]): List[A] = {
        @tailrec def local_compress(result: List[A], rem: List[A]): List[A] =
            rem match {
                case head :: next => local_compress(head :: result, next.dropWhile(_ == head))
                case Nil => result.reverse
            }

        local_compress(Nil, list)
    }

    def functionalCompress[A](list: List[A]): List[A] =
        list.foldRight(List[A]())((a, b) => if (b.isEmpty || a != b.head) a :: b else b)
}
