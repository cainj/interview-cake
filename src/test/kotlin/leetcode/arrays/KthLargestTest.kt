package leetcode.arrays

import leetcode.arrays.KthLargest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class KthLargestTest {

    @Test
    fun findKthLargest() {
        val kthLarge = KthLargest()
        assertEquals(5, kthLarge.findKthLargest(intArrayOf(3, 2, 1, 5, 6, 4), 2))
        assertEquals(-1, kthLarge.findKthLargest(intArrayOf(3, 2, 1, 5, 6, 4), 7))
        assertEquals(1, kthLarge.findKthLargest(intArrayOf(3, 2, 1, 5, 6, 4), 6))
        assertEquals(2, kthLarge.findKthLargest(intArrayOf(3, 2, 1, 5, 6, 4), 5))
    }
}
