package leetcode.binarysearch

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class HeatersTest {

    @Test
    fun findRadius() {
        val heaters = Heaters()
        assertEquals(1, heaters.findRadius(intArrayOf(1, 2, 3, 4), intArrayOf(1, 4)))
        assertEquals(1, heaters.findRadius(intArrayOf(1, 2, 3), intArrayOf(2)))
        assertEquals(8, heaters.findRadius(intArrayOf(1, 2, 3), intArrayOf(9)))
        assertEquals(Int.MAX_VALUE, heaters.findRadius(intArrayOf(1, 2, 3), intArrayOf()))
    }
}
