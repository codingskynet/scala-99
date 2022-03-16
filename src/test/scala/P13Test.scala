import org.scalatest.funsuite.AnyFunSuite

class P13Test extends AnyFunSuite {
    test("P13.1") {
        val a = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
        val b = List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e'))

        assert(P13.encodeDirect(a) == b)
    }

    test("P13.2") {
        assert(P13.encodeDirect(List()) == List())
    }
}
