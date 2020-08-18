package leetcode.challenge.august

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class DistributedCandiesTest {

    @Test
    fun distributeCandies() {
        val dc = DistributedCandies()
        assertArrayEquals(intArrayOf(5, 2, 3), dc.distributeCandies(10, 3))
        assertArrayEquals(intArrayOf(1, 2, 3, 1), dc.distributeCandies(7, 4))
    }
}
