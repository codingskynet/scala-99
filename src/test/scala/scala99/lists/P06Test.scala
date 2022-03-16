package scala99.lists

import org.scalatest.funsuite.AnyFunSuite

class P06Test extends AnyFunSuite{
    test("P06.1") {
        assert(P06.isPalindrome(List(1, 2, 3, 2, 1)))
    }

    test("P06.2") {
        assert(!P06.isPalindrome(List(1, 2, 3)))
    }

    test("P06.3") {
        assert(P06.isPalindrome(List(1, 2, 2, 1)))
    }

    test("P06.4") {
        assert(!P06.isPalindrome(List(1, 2, 3, 1)))
    }

    test("P06.5") {
        assert(P06.isPalindrome(List()))
    }
}
