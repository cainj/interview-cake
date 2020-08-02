package leetcode.contest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class GoodTripletsTest {

    @Test
    fun countGoodTriplets() {
        val cgt = GoodTriplets()
        assertEquals(4, cgt.countGoodTriplets(intArrayOf(3, 0, 1, 1, 9, 7), 7, 2, 3))
        assertEquals(0, cgt.countGoodTriplets(intArrayOf(1, 1, 2, 2, 3), 0, 0, 1))
    }
}
