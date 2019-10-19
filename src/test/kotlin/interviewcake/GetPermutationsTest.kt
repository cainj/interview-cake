package interviewcake

import org.junit.jupiter.api.Assertions.assertEquals
import java.util.Arrays
import java.util.HashSet
import org.junit.jupiter.api.Test



class GetPermutationsTest {

    @Test
    fun emptyStringTest() {
        val expected = HashSet(Arrays.asList(""))
        val actual = getPermutations("")
        assertEquals(expected, actual)
    }

    @Test
    fun catTest() {
        val expected = HashSet(Arrays.asList("cat"))
        val actual = getPermutations("cat")
        assertEquals(expected, actual)
    }

    @Test
    fun oneCharacterStringTest() {
        val expected = HashSet(Arrays.asList("a"))
        val actual = getPermutations("a")
        assertEquals(expected, actual)
    }

    @Test
    fun twoCharacterStringTest() {
        val expected = HashSet(Arrays.asList("ab", "ba"))
        val actual = getPermutations("ab")
        assertEquals(expected, actual)
    }

    @Test
    fun threeCharacterStringTest() {
        val expected = HashSet(
            Arrays.asList(
                "abc", "acb", "bac", "bca",
                "cab", "cba"
            )
        )
        val actual = getPermutations("abc")
        assertEquals(expected, actual)
    }

}