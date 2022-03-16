package scala99.arithmetic

import scala.annotation.tailrec

object P32 {
    @tailrec def gcd(a: Int, b: Int): Int =
        if (b == 0) a
        else gcd(b, a % b)
}
