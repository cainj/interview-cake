package leetcode.contest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class VowelsTest {

    @Test
    fun maxVowels() {
        val vowels = Vowels()
        assertEquals(3, vowels.maxVowels("abciiidef", 3))
        assertEquals(2, vowels.maxVowels("aeiou", 2))
        assertEquals(2, vowels.maxVowels("leetcode", 3))
        assertEquals(0, vowels.maxVowels("rhythms", 4))
        assertEquals(1, vowels.maxVowels("tryhard", 4))
    }
}
