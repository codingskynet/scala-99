object P10 {
    def encode[A](list: List[A]): List[(Int, A)] =
        P09.pack(list).map(a => (a.length, a.head))
}
