package leetcode.challenge.july

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class PrisonCellsTest {

    @Test
    fun prisonAfterNDays() {
        val prison = PrisonCells()
        assertArrayEquals(
            intArrayOf(0, 0, 1, 1, 0, 0, 0, 0),
            prison.prisonAfterNDays(intArrayOf(0, 1, 0, 1, 1, 0, 0, 1), 7)
        )
        assertArrayEquals(
            intArrayOf(0, 0, 1, 1, 1, 1, 1, 0),
            prison.prisonAfterNDays(intArrayOf(1, 0, 0, 1, 0, 0, 1, 0), 1000000000)
        )
    }
}
