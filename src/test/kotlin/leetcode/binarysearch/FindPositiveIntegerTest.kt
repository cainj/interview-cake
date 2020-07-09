package leetcode.binarysearch

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FindPositiveIntegerTest {

    @Test
    fun findSolution() {
        val posInt = FindPositiveInteger()
        assertEquals(
            listOf(listOf(1, 4), listOf(2, 3), listOf(3, 2), listOf(4, 1)),
            posInt.findSolution(FindPositiveInteger.CustomFunction(1), 5)
        )
        assertEquals(
            listOf(listOf(1, 5), listOf(5, 1)),
            posInt.findSolution(FindPositiveInteger.CustomFunction(2), 5)
        )
    }
}
