package leetcode.challenge.august

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ConsecutiveDiffTest {

    @Test
    fun numsSameConsecDiff() {
        val con = ConsecutiveDiff()
        assertEquals(hashSetOf(181, 292, 707, 818, 929), con.numsSameConsecDiff(3, 7).toSet())
        assertEquals(hashSetOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9), con.numsSameConsecDiff(1, 0).toSet())
    }
}
