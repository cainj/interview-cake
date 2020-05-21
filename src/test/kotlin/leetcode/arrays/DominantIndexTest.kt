package leetcode.arrays

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class DominantIndexTest {

    @Test
    fun dominantIndex() {
        val di = DominantIndex()
        assertEquals(0, di.dominantIndex(intArrayOf(9)))
        assertEquals(1, di.dominantIndex(intArrayOf(3, 6, 1, 0)))
        assertEquals(-1, di.dominantIndex(intArrayOf(1, 2, 3, 4)))
    }
}
