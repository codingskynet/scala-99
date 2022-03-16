import org.scalatest.funsuite.AnyFunSuite

import scala.util.Random

class P12Test extends AnyFunSuite {
    test("P12.1") {
        val a = List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e'))
        val b = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')

        assert(P12.decode(a) == b)
    }

    test("P12.2") {
        assert(P12.decode(List()) == List())
        assert(P12.decode(List((0, 'a'))) == List()) // very odd side case
    }

    test("P10/P12.randomTest") {
        val list = List.fill(2_000)(Random.nextInt(100))

        assert(P12.decode(P10.encode(list)) == list)
    }
}
