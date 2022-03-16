package scala99.lists

import org.scalatest.funsuite.AnyFunSuite

class P18Test extends AnyFunSuite {
    test("P18.1") {
        val a = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
        val b = List('d', 'e', 'f', 'g')

        assert(P18.slice(3, 7, a) == b)
        assert(P18.tailrecSlice(3, 7, a) == b)
        assert(P18.functionalSlice(3, 7, a) == b)
    }
}
