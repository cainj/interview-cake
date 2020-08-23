package leetcode.challenge.august

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MazeTest {

    @Test
    fun hasPath() {
        val maze = Maze()
        assertEquals(
            true, maze.hasPath(
                arrayOf(
                    intArrayOf(0, 0, 1, 0, 0),
                    intArrayOf(0, 0, 0, 0, 0),
                    intArrayOf(0, 0, 0, 1, 0),
                    intArrayOf(1, 1, 0, 1, 1),
                    intArrayOf(0, 0, 0, 0, 0)
                ), intArrayOf(0, 4), intArrayOf(4, 4)
            )
        )
    }
}
