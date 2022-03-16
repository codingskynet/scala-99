object P12 {
    def decode[A](list: List[(Int, A)]): List[A] =
        list.flatMap(t => List.fill(t._1)(t._2))
}
