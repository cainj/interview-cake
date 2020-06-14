package leetcode.contest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MinimumBouquetsTest {

    @Test
    fun minDays() {
        val md = MinimumBouquets()
        assertEquals(1000000000, md.minDays(intArrayOf(1000000000, 1000000000), 1, 1))
        assertEquals(9, md.minDays(intArrayOf(1, 10, 2, 9, 3, 8, 4, 7, 5, 6), 4, 2))
    }
}
