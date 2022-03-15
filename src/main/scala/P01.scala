import java.util.NoSuchElementException

object P01 {
    def last[A](list: List[A]): A =
        list match {
            case one :: Nil => one
            case _ :: next => last(next)
            case Nil => throw new NoSuchElementException
        }
}
