package leetcode.arrays

import leetcode.contest.ShuffleArray
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class ShuffleArrayTest {

    @Test
    fun shuffle() {
        val shuffleArray = ShuffleArray()
        assertArrayEquals(intArrayOf(2, 3, 5, 4, 1, 7), shuffleArray.shuffle(intArrayOf(2, 5, 1, 3, 4, 7), 3))
        assertArrayEquals(
            intArrayOf(1, 4, 2, 3, 3, 2, 4, 1),
            shuffleArray.shuffle(intArrayOf(1, 2, 3, 4, 4, 3, 2, 1), 4)
        )
        assertArrayEquals(
            intArrayOf(1, 2, 1, 2),
            shuffleArray.shuffle(intArrayOf(1, 1, 2, 2), 2)
        )
        assertThrows<IllegalArgumentException> {
            shuffleArray.shuffle(intArrayOf(1, 1, 2, 2), 3)
        }
    }
}
