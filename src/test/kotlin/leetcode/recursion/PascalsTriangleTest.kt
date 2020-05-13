package leetcode.recursion

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PascalsTriangleTest {

    @Test
    fun getRow() {
        val pascalsTriangle = PascalsTriangle()
        assertEquals(listOf(1, 3, 3, 1), pascalsTriangle.getRow(3))
        assertEquals(listOf(1), pascalsTriangle.getRow(0))
        assertEquals(listOf(1, 1), pascalsTriangle.getRow(1))
        assertEquals(listOf(1, 5, 10, 10, 5, 1), pascalsTriangle.getRow(5))
    }
}
