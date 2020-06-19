package leetcode.recursionII

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PermutationsTest {

    @Test
    fun permute() {
        val p = Permutations()
        assertEquals(
            listOf(
                listOf(1, 2, 3),
                listOf(1, 3, 2),
                listOf(2, 1, 3),
                listOf(2, 3, 1),
                listOf(3, 2, 1),
                listOf(3, 1, 2)
            ), p.permute(intArrayOf(1, 2, 3))
        )
    }
}
