object P04 {
    def length[A](list: List[A]): Int =
        list match {
            case _ :: next => 1 + length(next)
            case Nil => 0
        }
}
