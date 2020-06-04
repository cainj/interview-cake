package leetcode.challenge.april

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class NumberOfIslandsTest {

    @Test
    fun numIslands() {
        val ni = NumberOfIslands()
        assertEquals(
            1,
            ni.numIslands(
                arrayOf(
                    charArrayOf('1', '1', '1', '1', '0'),
                    charArrayOf('1', '1', '0', '1', '0'),
                    charArrayOf('1', '1', '0', '0', '0'),
                    charArrayOf('0', '0', '0', '0', '0')
                )
            )
        )
        assertEquals(
            3,
            ni.numIslands(
                arrayOf(
                    charArrayOf('1', '1', '0', '0', '0'),
                    charArrayOf('1', '1', '0', '0', '0'),
                    charArrayOf('0', '0', '1', '0', '0'),
                    charArrayOf('0', '0', '0', '1', '1')
                )
            )
        )
        assertEquals(
            0,
            ni.numIslands(
                arrayOf()
            )
        )
        assertEquals(
            0,
            ni.numIslands(
                arrayOf(
                    charArrayOf('0', '0', '0', '0', '0')
                )
            )
        )
    }
}
