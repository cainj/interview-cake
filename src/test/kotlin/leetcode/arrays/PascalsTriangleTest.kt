package leetcode.arrays

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PascalsTriangleTest {

    @Test
    fun generate() {
        val triangle = PascalsTriangle()
        assertEquals(emptyList<Int>(), triangle.generate(0))
        assertEquals(listOf(listOf(1)), triangle.generate(1))
        assertEquals(listOf(listOf(1), listOf(1, 1)), triangle.generate(2))
        assertEquals(listOf(listOf(1), listOf(1, 1), listOf(1, 2, 1)), triangle.generate(3))
        assertEquals(listOf(listOf(1), listOf(1, 1), listOf(1, 2, 1), listOf(1, 3, 3, 1)), triangle.generate(4))
    }
}
