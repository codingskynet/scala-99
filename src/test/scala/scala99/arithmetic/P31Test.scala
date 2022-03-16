package scala99.arithmetic

import org.scalatest.funsuite.AnyFunSuite
import scala99.P31

class P31Test extends AnyFunSuite {
    test("P31.1") {
        assert(P31.isPrime(7))
        assert(P31.isPrime(99991))
        assert(!P31.isPrime(57))
    }
}
