package leetcode.contest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class GoodPairsTest {

    @Test
    fun numIdenticalPairs() {
        val goodPairs = GoodPairs()

        assertEquals(4, goodPairs.numIdenticalPairs(intArrayOf(1, 2, 3, 1, 1, 3)))
        assertEquals(6, goodPairs.numIdenticalPairs(intArrayOf(1, 1, 1, 1)))
        assertEquals(0, goodPairs.numIdenticalPairs(intArrayOf(1, 2, 3)))
    }
}
