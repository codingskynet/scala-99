object P02 {
    def penultimate[A](list: List[A]): A =
        list match {
            case one :: _ :: Nil => one
            case _ :: next => penultimate(next)
            case _ => throw new NoSuchElementException
        }
}
