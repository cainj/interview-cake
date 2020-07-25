package leetcode.challenge.july

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class SingleNumberIIITest {

    @Test
    fun singleNumber() {
        val singleNumberIII = SingleNumberIII()
        assertArrayEquals(intArrayOf(3, 5), singleNumberIII.singleNumber(intArrayOf(1, 2, 1, 3, 2, 5)))
    }
}
