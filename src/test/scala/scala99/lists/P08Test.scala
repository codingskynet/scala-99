package scala99.lists

import org.scalatest.funsuite.AnyFunSuite

class P08Test extends AnyFunSuite{
    test("P08.1") {
        assert(P08.compress(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')) == List('a', 'b', 'c', 'a', 'd', 'e'))
        assert(P08.tailrecCompress(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')) == List('a', 'b', 'c', 'a', 'd', 'e'))
        assert(P08.functionalCompress(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')) == List('a', 'b', 'c', 'a', 'd', 'e'))
    }

    test("P08.2") {
        assert(P08.compress(List()) == List())
        assert(P08.tailrecCompress(List()) == List())
        assert(P08.functionalCompress(List()) == List())
    }
}
