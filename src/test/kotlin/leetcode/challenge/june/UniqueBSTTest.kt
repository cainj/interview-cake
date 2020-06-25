package leetcode.challenge.june

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class UniqueBSTTest {

    @Test
    fun numTrees() {
        val nt = UniqueBST()
        assertEquals(5, nt.numTrees(3))
        assertEquals(1, nt.numTrees(1))
        assertEquals(14, nt.numTrees(4))
        assertEquals(42, nt.numTrees(5))
    }
}
