package leetcode.binarysearch

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class IntersectionTwoArrayIITest {

    @Test
    fun intersect() {
        val i = IntersectionTwoArrayII()
        assertArrayEquals(intArrayOf(2, 2), i.intersect(intArrayOf(2, 2), intArrayOf(1, 2, 2, 1)))
        assertArrayEquals(intArrayOf(4, 9), i.intersect(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4)))
        assertArrayEquals(intArrayOf(), i.intersect(intArrayOf(4, 9, 5), intArrayOf()))
        assertArrayEquals(intArrayOf(1,1,1,1), i.intersect(intArrayOf(1,1,1,1,1), intArrayOf(1,1,1,1)))
    }
}
