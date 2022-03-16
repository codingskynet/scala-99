package scala99.lists

object P11 {
    def encodeModified[A](list: List[A]): List[Any] = // more typesafe: List[Either[A, (Int, A)]]
        P10.encode(list).map(t => if (t._1 == 1) t._2 else t)
}
