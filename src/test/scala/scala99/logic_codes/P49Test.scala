package scala99.logic_codes

import org.scalatest.funsuite.AnyFunSuite

class P49Test extends AnyFunSuite {
    test("P49.1") {
        assert(P49.gray(3) == List("000", "001", "011", "010", "110", "111", "101", "100"))
    }
}
