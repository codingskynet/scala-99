package scala99.arithmetic

object P31 {
    def isPrime(num: Int): Boolean = {
        (2 :: List.range(3, math.sqrt(num).toInt, 2)).forall(num % _ != 0)
    }
}
