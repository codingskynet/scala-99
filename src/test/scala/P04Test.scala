import org.scalatest.funsuite.AnyFunSuite

class P04Test extends AnyFunSuite {
    test("P04.1") {
        assert(P04.length(List(1, 1, 2, 3, 5, 8)) == 6)
    }

    test("P04.2") {
        assert(P04.length(List()) == 0)
    }
}
