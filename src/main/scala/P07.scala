object P07 {
    def flatten(list: List[Any]): List[Any] =
        list flatMap {
            case l: List[_] => flatten(l)
            case any => List(any)
        }
}
