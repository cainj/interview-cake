package leetcode.queues

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PerfectSquaresTest {

    @Test
    fun numSquares() {
        val ps = PerfectSquares()

        assertEquals(3, ps.numSquares(12))
        assertEquals(2, ps.numSquares(13))
        assertEquals(0, ps.numSquares(0))
        assertEquals(3, ps.numSquares(1221))
    }
}