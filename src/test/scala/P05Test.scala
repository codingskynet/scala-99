import org.scalatest.funsuite.AnyFunSuite

class P05Test extends AnyFunSuite {
    test("P05.1") {
        assert(P05.reverse(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1))
    }

    test("P05.2") {
        assert(P05.reverse(List()) == List())
    }

    test("P05.3") {
        assert(P05.reverse(List(1, 1, 2, 3, 5, 8)) == P05.reverse_fast(List(1, 1, 2, 3, 5, 8)))
    }

    test("P05.perf") {
        val list = List.range(1, 1_000)

        // O(n^2)
        val (reverse, _) = Utils.elapsedTime {
            P05.reverse(list)
        }

        // O(n)
        val (reverse_fast, _) = Utils.elapsedTime {
            P05.reverse_fast(list)
        }

        println("reverse_fast is x" + (1.0f * reverse / reverse_fast) + " faster than reverse.")
    }
}
