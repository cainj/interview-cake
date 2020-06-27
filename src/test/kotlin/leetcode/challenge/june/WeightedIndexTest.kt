package leetcode.challenge.june

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class WeightedIndexTest {

    @Test
    fun pickIndex() {
        var wi = WeightedIndex(intArrayOf(3, 14, 1, 7))
        assertEquals(wi.pickIndex(), 1)
        wi = WeightedIndex(intArrayOf(2, 5, 7, 11, 4))
        assertEquals(3, wi.pickIndex())
    }
}
