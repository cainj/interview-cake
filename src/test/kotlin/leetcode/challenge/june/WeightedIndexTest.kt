package leetcode.challenge.june

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class WeightedIndexTest {

    @Test
    fun pickIndex() {
        val wi = WeightedIndex(intArrayOf(3, 14, 1, 7))
        assertEquals(true, wi.pickIndex() != 0)
    }
}
