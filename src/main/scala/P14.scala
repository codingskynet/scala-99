object P14 {
    def duplicate[A](list: List[A]): List[A] =
        list.flatMap(e => List(e, e))
}
