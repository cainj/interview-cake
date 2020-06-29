package leetcode.challenge.june

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class UniquePathsTest {

    @Test
    fun findUniquePaths() {
        val uniquePaths = UniquePaths()
        assertEquals(28, uniquePaths.findUniquePaths(7, 3))
        assertEquals(3, uniquePaths.findUniquePaths(3, 2))
        assertEquals(1, uniquePaths.findUniquePaths(1, 1))
        assertEquals(4368, uniquePaths.findUniquePaths(12, 6))
    }
}
