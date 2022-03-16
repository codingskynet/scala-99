package scala99.lists

import org.scalatest.funsuite.AnyFunSuite

class P11Test extends AnyFunSuite {
    test("P11.1") {
        val a = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
        val b = List((4, 'a'), 'b', (2, 'c'), (2, 'a'), 'd', (4, 'e'))

        assert(P11.encodeModified(a) == b)
    }

    test("P11.2") {
        assert(P11.encodeModified(List()) == List())
    }
}
