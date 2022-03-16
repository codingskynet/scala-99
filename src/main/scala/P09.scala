import scala.annotation.tailrec

object P09 {
    // reference solution, but it is not tailrec
    def packR[A](list: List[A]): List[List[A]] = {
        if (list.isEmpty)
            List()
        else {
            val (packed, next) = list span { _ == list.head }
            if (next == Nil)
                List(packed)
            else
                packed :: packR(next)
        }
    }

    // make reference solution for tailrec
    def tailrecPackR[A](list: List[A]): List[List[A]] = {
        @tailrec def local_packR(heads: List[List[A]], rem: List[A]): List[List[A]] = {
            if (rem == Nil) return heads.reverse

            val (packed, next) = rem span { _ == rem.head }
            local_packR(packed :: heads, next)
        }

        if (list.isEmpty) return List()

        local_packR(Nil, list)
    }

    def pack[A](list: List[A]): List[List[A]] = {
        @tailrec def localPack(result: List[List[A]], now: List[A], rem: List[A]): List[List[A]] =
            rem match {
                case head :: next =>
                    if (now.isEmpty || now.head == head)
                        localPack(result, head :: now, next)
                    else
                        localPack(now :: result, List(head), next)
                case Nil =>
                    (now :: result).reverse
            }

        if (list.isEmpty) return List()

        localPack(Nil, Nil, list)
    }
}
