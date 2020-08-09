package leetcode.challenge.august

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class RottenOrangesTest {

    @Test
    fun orangesRotting() {
        val rottenOrangesTest = RottenOranges()
        assertEquals(0, rottenOrangesTest.orangesRotting(arrayOf(intArrayOf(0))))
        assertEquals(
            -1, RottenOranges().orangesRotting(
                arrayOf(
                    intArrayOf(2, 1, 1),
                    intArrayOf(0, 1, 1),
                    intArrayOf(1, 0, 1)
                )
            )
        )
        assertEquals(
            4, rottenOrangesTest.orangesRotting(
                arrayOf(
                    intArrayOf(2, 1, 1),
                    intArrayOf(0, 1, 1),
                    intArrayOf(0, 0, 1)
                )
            )
        )
        assertEquals( 0, rottenOrangesTest.orangesRotting(arrayOf(intArrayOf(0, 2))))
        assertEquals(0, rottenOrangesTest.orangesRotting(arrayOf(intArrayOf(2))))
        assertEquals(-1, rottenOrangesTest.orangesRotting(arrayOf(intArrayOf(1))))

    }
}
