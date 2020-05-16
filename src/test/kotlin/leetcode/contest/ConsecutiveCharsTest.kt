package leetcode.contest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ConsecutiveCharsTest {

    @Test
    fun maxPower() {
        val cc = ConsecutiveChars()
        assertEquals(2, cc.maxPower("leetcode"))
        assertEquals(5, cc.maxPower("triplepillooooow"))
        assertEquals(11, cc.maxPower("hooraaaaaaaaaaay"))
        assertEquals(1, cc.maxPower("tourist"))
    }
}
