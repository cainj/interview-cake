package leetcode.challenge.may

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class RansomNoteTest {

    @Test
    fun canConstruct() {
        val cc = RansomNote()
        assertEquals(true, cc.canConstruct("aa", "aab"))
        assertEquals(true, cc.canConstruct("", ""))
        assertEquals(true, cc.canConstruct("bg", "asjlfasdhjbzvxmnsadfhqeuirbgg"))
        assertEquals(true, cc.canConstruct("ab", "ab"))
    }
}
