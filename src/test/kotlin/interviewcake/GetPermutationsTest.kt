package interviewcake

import org.junit.jupiter.api.Assertions.assertEquals
import java.util.Arrays
import java.util.HashSet
import org.junit.jupiter.api.Test



class GetPermutationsTest {

    @Test
    fun emptyStringTest() {
        val expected = emptySet<String>()
        val actual = getPermutations("")
        assertEquals(expected, actual)
    }

    @Test
    fun catTest() {
        val expected = hashSetOf("cat", "cta", "act", "atc", "tac", "tca")
        val actual = getPermutations("cat")
        assertEquals(expected, actual)
    }

    @Test
    fun oneCharacterStringTest() {
        val expected = HashSet(listOf("a"))
        val actual = getPermutations("a")
        assertEquals(expected, actual)
    }

    @Test
    fun twoCharacterStringTest() {
        val expected = HashSet(listOf("ab", "ba"))
        val actual = getPermutations("ab")
        assertEquals(expected, actual)
    }

    @Test
    fun threeCharacterStringTest() {
        val expected = HashSet(
            listOf(
                "abc", "acb", "bac", "bca",
                "cab", "cba"
            )
        )
        val actual = getPermutations("abc")
        assertEquals(expected, actual)
    }

}