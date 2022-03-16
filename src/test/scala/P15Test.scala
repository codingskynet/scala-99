import org.scalatest.funsuite.AnyFunSuite

class P15Test extends AnyFunSuite {
    test("P15.1") {
        val a = List('a', 'b', 'c', 'c', 'd')
        val b = List('a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c', 'c', 'c', 'c', 'd', 'd', 'd')

        assert(P15.duplicateN(3, a) == b)
    }

    test("P15.2") {
        assert(P15.duplicateN(1000, List()) == List())
    }
}
