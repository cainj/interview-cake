package leetcode.bst

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class KthLargestTest {

    @Test
    fun add() {
        val kth = KthLargest(3, intArrayOf(4, 5, 8, 2))
        Assertions.assertEquals(4, kth.add(3))
        Assertions.assertEquals(5, kth.add(5))
        Assertions.assertEquals(5, kth.add(10))
        Assertions.assertEquals(8, kth.add(9))
        Assertions.assertEquals(8, kth.add(4))
    }
}
