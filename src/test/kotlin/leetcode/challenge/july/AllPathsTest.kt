package leetcode.challenge.july

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class AllPathsTest {

    @Test
    fun allPathsSourceTarget() {
        val allPaths = AllPaths()
        assertEquals(
            listOf(listOf(0, 1, 3), listOf(0, 2, 3)),
            allPaths.allPathsSourceTarget(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(3),
                    intArrayOf(3),
                    intArrayOf()
                )
            )
        )
    }
}
