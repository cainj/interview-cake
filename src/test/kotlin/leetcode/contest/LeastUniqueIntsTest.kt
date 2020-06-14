package leetcode.contest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LeastUniqueIntsTest {

    @Test
    fun findLeastNumOfUniqueInts() {
        val fln = LeastUniqueInts()
        assertEquals(2, fln.findLeastNumOfUniqueInts(intArrayOf(4, 3, 1, 1, 3, 3, 2), 3))
        assertEquals(1, fln.findLeastNumOfUniqueInts(intArrayOf(5,5,4), 1))
    }
}
