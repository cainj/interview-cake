package leetcode.challenge.august

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class DetectCapitalTest {

    @Test
    fun detectCapitalUse() {
        val dc = DetectCapital()
        assertEquals(true , dc.detectCapitalUse("USA"))
        assertEquals( true, dc.detectCapitalUse("flag"))
        assertEquals( true, dc.detectCapitalUse("Google"))
        assertEquals( false, dc.detectCapitalUse("GooglD"))
    }
}
