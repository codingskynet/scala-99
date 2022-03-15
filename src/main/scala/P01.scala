import java.util.NoSuchElementException
import scala.annotation.tailrec

object P01 {
    @tailrec def last[A](list: List[A]): A =
        list match {
            case one :: Nil => one
            case _ :: next => last(next)
            case Nil => throw new NoSuchElementException
        }
}
