package leetcode.recursion

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class KthGrammarTest {

    @Test
    fun kthGrammar() {
        val kth = KthGrammar()
        assertEquals(0, kth.kthGrammar(1, 1))
        assertEquals(1, kth.kthGrammar(4, 5))
        assertEquals(1, kth.kthGrammar(30, 23))
    }
}
