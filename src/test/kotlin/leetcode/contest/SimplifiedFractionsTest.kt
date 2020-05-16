package leetcode.contest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SimplifiedFractionsTest {

    @Test
    fun simplifiedFractions() {
        val sf = SimplifiedFractions()
        assertEquals(listOf("1/2"), sf.simplifiedFractions(2))
        assertEquals(listOf("1/2", "1/3", "2/3"), sf.simplifiedFractions(3))
        assertEquals(listOf("1/2", "1/3", "2/3", "1/4", "3/4"), sf.simplifiedFractions(4))
        assertEquals(emptyList<String>(), sf.simplifiedFractions(1))
    }
}
