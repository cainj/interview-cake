package leetcode.binarysearch

import leetcode.binarysearch.KokoBananas
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class KokoBananasTest {

    @Test
    fun minEatingSpeed() {
        val kokoBananas = KokoBananas()
        assertEquals(4, kokoBananas.minEatingSpeed(intArrayOf(3, 6, 7, 11), 8))
        assertEquals(30, kokoBananas.minEatingSpeed(intArrayOf(30, 11, 23, 4, 20), 5))
        assertEquals(23, kokoBananas.minEatingSpeed(intArrayOf(30, 11, 23, 4, 20), 6))
    }
}
