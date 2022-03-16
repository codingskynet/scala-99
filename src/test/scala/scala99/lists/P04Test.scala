package scala99.lists

import org.scalatest.funsuite.AnyFunSuite

class P04Test extends AnyFunSuite {
    test("P04.1") {
        assert(P04.length(List(1, 1, 2, 3, 5, 8)) == 6)
    }

    test("P04.2") {
        assert(P04.length(List()) == 0)
    }

    test("P04.tailrec") {
        val len = 1_000_000
        val list = List.range(0, len)

        assertThrows[StackOverflowError] {
            P04.length(list)
        }

        assert(P04.tailrec_length(list) == len)
    }
}
