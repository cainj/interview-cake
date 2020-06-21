package leetcode.challenge.june

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class DungeonTest {

    @Test
    fun calculateMinimumHP() {
        val dungeon = Dungeon()
        assertEquals(
            7,
            dungeon.calculateMinimumHP(
                arrayOf(
                    intArrayOf(-2, -3, 3),
                    intArrayOf(-5, -10, 1),
                    intArrayOf(10, 30, -5)
                )
            )
        )
        assertEquals(
            1,
            dungeon.calculateMinimumHP(
                arrayOf(
                    intArrayOf(0,0)
                )
            )
        )
    }
}
