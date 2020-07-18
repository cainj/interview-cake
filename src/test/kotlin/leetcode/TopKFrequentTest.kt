package leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class TopKFrequentTest {

    @Test
    fun topKFrequent() {
        val topKFrequent = TopKFrequent()
        assertArrayEquals(intArrayOf(2, 1), topKFrequent.topKFrequent(intArrayOf(1, 1, 1, 2, 2, 3), 2))
        assertArrayEquals(intArrayOf(1), topKFrequent.topKFrequent(intArrayOf(1), 1))
        assertArrayEquals(intArrayOf(1, 3), topKFrequent.topKFrequent(intArrayOf(1, 0, 3, 1, 3, 3), 2))
    }
}
