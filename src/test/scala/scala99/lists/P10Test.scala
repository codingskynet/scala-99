package scala99.lists

import org.scalatest.funsuite.AnyFunSuite

class P10Test extends AnyFunSuite{
    test("P10.1") {
        val a = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
        val b = List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e'))

        assert(P10.encode(a) == b)
    }

    test("P10.2") {
        assert(P10.encode(List()) == List())
    }
}
