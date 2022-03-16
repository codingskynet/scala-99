package scala99.lists

object P16 {
    def drop[A](n: Int, list: List[A]): List[A] =
        list.zipWithIndex.filter(e => (e._2 + 1) % n != 0).map(_._1)
}
