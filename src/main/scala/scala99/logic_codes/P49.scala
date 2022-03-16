package scala99.logic_codes

import scala.collection.mutable.ArrayBuffer

object P49 {
    val cache: ArrayBuffer[List[String]] = ArrayBuffer[List[String]](List(""))

    def gray(n: Int): List[String] = {
        if (n < cache.length) return cache(n)

        val lowerGray = gray(n - 1)
        cache += lowerGray.map("0" + _) ::: lowerGray.reverse.map("1" + _)
        cache(n)
    }
}
