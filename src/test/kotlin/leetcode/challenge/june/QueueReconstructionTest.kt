package leetcode.challenge.june

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class QueueReconstructionTest {

    @Test
    fun reconstructQueue() {
        val queue = QueueReconstruction()
        assertArrayEquals(
            arrayOf(
                intArrayOf(5, 0),
                intArrayOf(7, 0),
                intArrayOf(5, 2),
                intArrayOf(6, 1),
                intArrayOf(4, 4),
                intArrayOf(7, 1)
            ),
            queue.reconstructQueue(
                arrayOf(
                    intArrayOf(7, 0),
                    intArrayOf(4, 4),
                    intArrayOf(7, 1),
                    intArrayOf(5, 0),
                    intArrayOf(6, 1),
                    intArrayOf(5, 2)
                )
            )
        )
    }
}
