import org.scalatest.funsuite.AnyFunSuite

import java.util.NoSuchElementException

class P01Test extends AnyFunSuite {
    test("P01.1") {
        assert(P01.last(List(1, 1, 2, 3, 5, 8)) == 8)
    }

    test("P01.2") {
        assert(P01.last(List(1)) == 1)
    }

    test("P01.3") {
        assertThrows[NoSuchElementException] {
            P01.last(List())
        }
    }
}
