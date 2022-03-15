object P03 {
    def nth[A](idx: Int, list: List[A]): A =
        list match {
            case head :: next =>
                if (idx == 0) {
                    head
                } else {
                    nth(idx - 1, next)
                }

            case Nil => throw new NoSuchElementException
        }
}
