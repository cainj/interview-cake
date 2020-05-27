package leetcode.arrays

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ReverseWordsIIITest {

    @Test
    fun reverseWords() {
        val rw = ReverseWordsIII()
        assertEquals("s'teL ekat edoCteeL tsetnoc", rw.reverseWords("Let's take LeetCode contest"))
        assertEquals("", rw.reverseWords(""))
        assertEquals("loop si !taerg", rw.reverseWords("pool is great!"))
    }
}
