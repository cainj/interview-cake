package leetcode.challenge.july

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SubsetsTest {

    @Test
    fun subsets() {
        val sub = Subsets()
        assertEquals(
            hashSetOf(
                listOf(),
                listOf(1),
                listOf(2),
                listOf(3),
                listOf(1, 2),
                listOf(1, 3),
                listOf(2, 3),
                listOf(1, 2, 3)
            ),
            sub.subsets(intArrayOf(1, 2, 3)).toSet()
        )
    }
}
