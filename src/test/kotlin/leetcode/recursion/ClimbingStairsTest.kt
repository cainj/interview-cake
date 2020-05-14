package leetcode.recursion

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ClimbingStairsTest {

    @Test
    fun climb() {
        val c = ClimbingStairs()
        assertEquals(1, c.climb(1))
        assertEquals(13, c.climb(6))
        assertEquals(233, c.climb(12))
    }
}
