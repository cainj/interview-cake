package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MySqrtTest {

    @Test
    fun mySqrt() {
        val mys = MySqrt()
        var nums = intArrayOf(-1, 0, 3, 5, 9, 12)
//        assertEquals(0, mys.mySqrt(0))
//        assertEquals(1, mys.mySqrt(1))
//        assertEquals(1, mys.mySqrt(2))
        assertEquals(1, mys.mySqrt(3))
        assertEquals(2, mys.mySqrt(4))
        assertEquals(2, mys.mySqrt(5))
        assertEquals(2, mys.mySqrt(7))
        assertEquals(2, mys.mySqrt(8))
        assertEquals(3, mys.mySqrt(9))
        assertEquals(46339, mys.mySqrt(2147395599))
        assertEquals(46340, mys.mySqrt(2147483647))
    }
}
