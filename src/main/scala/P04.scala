import scala.annotation.tailrec

object P04 {
    def length[A](list: List[A]): Int =
        list match {
            case _ :: next => 1 + length(next)
            case Nil => 0
        }

    def tailrec_length[A](list: List[A]): Int = {
        @tailrec def local_length(n: Int, l: List[A]): Int = {
            l match {
                case _ :: next => local_length(n + 1, next)
                case Nil => n
            }
        }

        local_length(0, list)
    }
}
