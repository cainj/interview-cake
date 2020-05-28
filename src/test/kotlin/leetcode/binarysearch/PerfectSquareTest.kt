package leetcode.binarysearch

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PerfectSquareTest {

    @Test
    fun isPerfectSquare() {
        val ps = PerfectSquare()
        assertEquals(false, ps.isPerfectSquare(10))
        assertEquals(true, ps.isPerfectSquare(1))
        assertEquals(true, ps.isPerfectSquare(9))
        assertEquals(true, ps.isPerfectSquare(16))
        assertEquals(false, ps.isPerfectSquare(27))
        assertEquals(true, ps.isPerfectSquare(638401))
    }
}
