package leetcode.contest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ReorderRoutesTest {

    @Test
    fun minReorder() {
        val reorder = ReorderRoutes()
        assertEquals(
            3,
            reorder.minReorder(
                6,
                arrayOf(intArrayOf(0, 1), intArrayOf(1, 3), intArrayOf(2, 3), intArrayOf(4, 0), intArrayOf(4, 5))
            )
        )
        assertEquals(
            2,
            reorder.minReorder(
                5,
                arrayOf(intArrayOf(1, 0), intArrayOf(1, 2), intArrayOf(3, 2), intArrayOf(3, 4))
            )
        )
        assertEquals(
            0,
            reorder.minReorder(
                3,
                arrayOf(intArrayOf(1, 0), intArrayOf(2, 0))
            )
        )
    }
}
