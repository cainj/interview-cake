package leetcode.queues

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class ClosestPointsTest {

    @Test
    fun kClosest() {
        val closestPoint = ClosestPoints()
        assertArrayEquals(
            arrayOf(intArrayOf(-2, 2)),
            closestPoint.kClosest(arrayOf(intArrayOf(1, 3), intArrayOf(-2, 2)), 1)
        )
        assertArrayEquals(
            arrayOf(intArrayOf(-2, 4), intArrayOf(3, 3)),
            closestPoint.kClosest(arrayOf(intArrayOf(3, 3), intArrayOf(5, -1), intArrayOf(-2, 4)), 2)
        )
    }
}
