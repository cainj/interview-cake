package leetcode.graphtheory

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MinHeightTreesTest {

    @Test
    fun findMinHeightTrees() {
        val minHeight = MinHeightTrees()
        assertEquals(
            listOf(1),
            minHeight.findMinHeightTrees(4, arrayOf(intArrayOf(1, 0), intArrayOf(1, 2), intArrayOf(1, 3)))
        )
        assertEquals(
            listOf(3, 4),
            minHeight.findMinHeightTrees(
                6,
                arrayOf(intArrayOf(0, 3), intArrayOf(1, 3), intArrayOf(2, 3), intArrayOf(4, 3), intArrayOf(5, 4))
            )
        )

    }
}
