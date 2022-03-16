package scala99.lists

import org.scalatest.funsuite.AnyFunSuite
import scala99.Utils

import scala.util.Random

class P09Test extends AnyFunSuite{
    test("P09.1") {
        val a = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
        val b = List(List('a', 'a', 'a', 'a'), List('b'), List('c', 'c'), List('a', 'a'), List('d'), List('e', 'e', 'e', 'e'))

        assert(P09.packR(a) == b)
        assert(P09.tailrecPackR(a) == b)
        assert(P09.pack(a) == b)
    }

    test("P09.2") {
        val a = List()
        val b = List()
        // The solution of reference is List(List()), but I think just empty list is more reasonable
        // since List(List()) also says List(List(), List(), ..., List()) is okay.
        // And this way is more helpful for implementing P10's empty input.

        assert(P09.packR(a) == b)
        assert(P09.tailrecPackR(a) == b)
        assert(P09.pack(a) == b)
    }

    test("P09.perf") {
        val list = List.fill(2_000)(Random.nextInt(100))

        val packR = Utils.elapsedTime(P09.packR(list)) // for big size, it cause stack overflow
        val tailrecPackR = Utils.elapsedTime(P09.tailrecPackR(list))
        val pack = Utils.elapsedTime(P09.pack(list))

        println("packR:        " + packR._1 + " ns")
        println("tailrecPackR: " + tailrecPackR._1 + " ns")
        println("pack:         " + pack._1 + " ns")
    }
}
