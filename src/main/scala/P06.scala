import scala.annotation.tailrec

object P06 {
    @tailrec def isPalindrome[A](list: List[A]): Boolean =
        list match {
            case Nil => true
            case a :: _ :: c :: Nil => a == c
            case head +: inner :+ tail => head == tail && isPalindrome(inner)
        }
}
