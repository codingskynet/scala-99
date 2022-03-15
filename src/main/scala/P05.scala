object P05 {
    // not tail-recursive(exist the risk of stack overflow)
    // O(n^2) since re-create List is O(n)
    def reverse[A](list: List[A]): List[A] =
        list match {
            case head :: next => reverse(next) ::: head :: Nil
            case Nil => Nil
        }

    def reverse_fast[A](list: List[A]): List[A] =
        list.foldLeft(List[A]())((a, b) => b :: a)
}
