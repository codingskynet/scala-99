import org.scalatest.funsuite.AnyFunSuite

class P14Test extends AnyFunSuite {
    test("P14.1") {
        val a = List('a', 'b', 'c', 'c', 'd')
        val b = List('a', 'a', 'b', 'b', 'c', 'c', 'c', 'c', 'd', 'd')

        assert(P14.duplicate(a) == b)
    }

    test("P14.2") {
        assert(P14.duplicate(List()) == List())
    }
}
