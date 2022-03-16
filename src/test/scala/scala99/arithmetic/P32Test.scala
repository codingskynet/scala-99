package scala99.arithmetic

import org.scalatest.funsuite.AnyFunSuite

class P32Test extends AnyFunSuite {
    test("P32.1") {
        assert(P32.gcd(36, 63) == 9)
    }
}
