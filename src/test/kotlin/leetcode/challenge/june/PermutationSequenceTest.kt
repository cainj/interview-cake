package leetcode.challenge.june

import org.junit.jupiter.api.Assertions.assertEquals

internal class PermutationSequenceTest {

    @org.junit.jupiter.api.Test
    fun getPermutation() {
        val p = PermutationSequence()
        assertEquals("213", p.getPermutation(3, 3))
        assertEquals("2314", p.getPermutation(4, 9))
        assertEquals("231", p.getPermutation(3, 4))
        assertEquals("321", p.getPermutation(3, 6))
    }
}
