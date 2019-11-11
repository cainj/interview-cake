package karat

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FindingUnknownParentsTest {
    @Test
    fun sampleTest() {
        /**
         * Sample input/output (pseudodata):
         *
         * parentChildPairs = [
         * (1, 3), (2, 3), (3, 6), (5, 6),
         * (5, 7), (4, 5), (4, 8), (4, 9), (9, 11)
         * ]
         *
         * Output may be in any order:
         * findNodesWithZeroAndOneParents(parentChildPairs) => [
         * [1, 2, 4],       // Individuals with zero parents\
         * [5, 7, 8, 9, 11] // Individuals with exactly one parent
         * ]
         *
         */

        val image = arrayOf(
            intArrayOf(1, 3), intArrayOf(2, 3), intArrayOf(3, 6), intArrayOf(5, 6),
            intArrayOf(5, 7), intArrayOf(4, 5), intArrayOf(4, 8), intArrayOf(4, 9), intArrayOf(9, 11)
        )

        val actual = findNodesWithZeroAndOneParents(image)
        Assertions.assertEquals(3, actual[0].intersect(setOf(4, 2, 1)).size)
        Assertions.assertEquals(true, actual[1].containsAll(setOf(5, 7, 8, 9, 11)))
    }
}