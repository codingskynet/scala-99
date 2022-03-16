import org.scalatest.funsuite.AnyFunSuite

class P17Test extends AnyFunSuite {
    test("P17.1") {
        val a = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
        val b = (List('a', 'b', 'c'), List('d', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))

        assert(P17.split(3, a) == b)
        assert(P17.tailrecSplit(3, a) == b)
        assert(P17.functionalSplit(3, a) == b)
    }
}
