package scala99.lists

import org.scalatest.funsuite.AnyFunSuite

class P02Test extends AnyFunSuite{
    test("P02.1") {
        assert(P02.penultimate(List(1, 1, 2, 3, 5, 8)) == 5)
    }

    test("P02.2") {
        assert(P02.penultimate(List(1, 2)) == 1)
    }

    test("P02.3") {
        assertThrows[NoSuchElementException] {
            P02.penultimate(List(1))
        }
    }

    test("P02.4") {
        assertThrows[NoSuchElementException] {
            P02.penultimate(List())
        }
    }

}
