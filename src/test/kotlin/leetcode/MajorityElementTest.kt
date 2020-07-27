package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MajorityElementTest {

    @Test
    fun majorityElement() {
        val me = MajorityElement()
        assertEquals(1, me.majorityElement(intArrayOf(1, 1, 1, 2, 2)))
        assertEquals(3, me.majorityElement(intArrayOf(3, 2, 3)))
        assertEquals(2, me.majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2)))
    }
}
