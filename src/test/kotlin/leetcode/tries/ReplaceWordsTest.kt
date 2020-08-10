package leetcode.tries

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ReplaceWordsTest {

    @Test
    fun replaceWords() {
        val rp = ReplaceWords()
        assertEquals(
            "the cat was rat by the bat",
            rp.replaceWords(listOf("cat", "bat", "rat"), "the cattle was rattled by the battery")
        )
    }
}
