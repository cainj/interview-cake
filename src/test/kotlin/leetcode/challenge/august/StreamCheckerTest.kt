package leetcode.challenge.august

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class StreamCheckerTest {

    @Test
    fun query() {
        val checker = StreamChecker(arrayOf("cd", "f", "kl"))
        assertEquals(false, checker.query('a'))
        assertEquals(false, checker.query('b'))
        assertEquals(false, checker.query('c'))
        assertEquals(true, checker.query('d'))
        assertEquals(false, checker.query('h'))
        assertEquals(true, checker.query('f'))
        assertEquals(false, checker.query('i'))
        assertEquals(false, checker.query('k'))
        assertEquals(true, checker.query('l'))
    }
}
