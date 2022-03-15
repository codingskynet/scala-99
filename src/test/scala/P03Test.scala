import org.scalatest.funsuite.AnyFunSuite

class P03Test extends AnyFunSuite {
    test("P03.1") {
        assert(P03.nth(2, List(1, 1, 2, 3, 5, 8)) == 2)
    }

    test("P03.2") {
        assertThrows[NoSuchElementException] {
            P03.nth(3, List(1, 1))
        }
    }

    test("P03.3") {
        assertThrows[NoSuchElementException] {
            P03.nth(0, List())
        }
    }
}
