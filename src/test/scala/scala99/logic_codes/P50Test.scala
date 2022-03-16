package scala99.logic_codes

import org.scalatest.funsuite.AnyFunSuite

class P50Test extends AnyFunSuite {
    test("P50.1") {
        val a = List(("a", 45), ("b", 13), ("c", 12), ("d", 16), ("e", 9), ("f", 5))
        val b = List(("a", "0"), ("b", "101"), ("c", "100"), ("d", "111"), ("e", "1101"), ("f", "1100"))

        assert(P50.huffman(a) == b)
    }
}
