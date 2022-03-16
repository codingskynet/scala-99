package scala99.lists

import org.scalatest.funsuite.AnyFunSuite

class P16Test extends AnyFunSuite {
    test("P16.1") {
        val a = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
        val b = List('a', 'b', 'd', 'e', 'g', 'h', 'j', 'k')

        assert(P16.drop(3, a) == b)
    }

    test("P16.2") {
        assert(P16.drop(10, List()) == List())
        assert(P16.drop(1, List.fill(1)(100)) == List())
    }
}
