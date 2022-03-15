import org.scalatest.funsuite.AnyFunSuite

class P07Test extends AnyFunSuite{
    test("P07.1") {
        assert(P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == List(1, 1, 2, 3, 5, 8))
    }
}
