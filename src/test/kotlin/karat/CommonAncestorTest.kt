package karat

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CommonAncestorTest {
    @Test
    fun sampleTest() {

        val parentChildPairs1 = arrayOf(
            intArrayOf(1, 3),
            intArrayOf(2, 3),
            intArrayOf(3, 6),
            intArrayOf(5, 6),
            intArrayOf(5, 7),
            intArrayOf(4, 5),
            intArrayOf(4, 8),
            intArrayOf(4, 9),
            intArrayOf(9, 11),
            intArrayOf(14, 4),
            intArrayOf(13, 12),
            intArrayOf(12, 9)
        )

        val actual = hasCommonAncestor(parentChildPairs1, 6, 8)
        Assertions.assertEquals(hasCommonAncestor(parentChildPairs1, 3, 8), false)
        Assertions.assertEquals(hasCommonAncestor(parentChildPairs1, 5, 8), true)
        Assertions.assertEquals(hasCommonAncestor(parentChildPairs1, 6, 8), true)
        Assertions.assertEquals(hasCommonAncestor(parentChildPairs1, 6, 9), true)
        Assertions.assertEquals(hasCommonAncestor(parentChildPairs1, 1, 3) ,false)
        Assertions.assertEquals(hasCommonAncestor(parentChildPairs1, 7, 11) , true)
        Assertions.assertEquals(hasCommonAncestor(parentChildPairs1, 6, 5),true)
        Assertions.assertEquals(hasCommonAncestor(parentChildPairs1, 5, 6),true)
        Assertions.assertEquals(true, actual)
    }
}