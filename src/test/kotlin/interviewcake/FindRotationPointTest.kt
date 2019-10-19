package interviewcake

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class FindRotationPointTest {

    @Test
    fun smallArrayTest() {
        val actual = findRotationPoint(arrayOf("cape", "cake"))
        val expected = 1
        assertEquals(expected, actual)
    }

    @Test
    fun mediumArrayTest() {
        val actual = findRotationPoint(arrayOf("grape", "orange", "plum", "radish", "apple"))
        val expected = 4
        assertEquals(expected, actual)
    }

    @Test
    fun largeArrayTest() {
        val actual = findRotationPoint(
            arrayOf(
                "ptolemaic",
                "retrograde",
                "supplant",
                "undulate",
                "xenoepist",
                "asymptote",
                "babka",
                "banoffee",
                "engender",
                "karpatka",
                "othellolagkage"
            )
        )
        val expected = 5
        assertEquals(expected, actual)
    }

    @Test
    fun possiblyMissingEdgeCaseTest() {
        // are we missing any edge cases?
        findRotationPoint(
            arrayOf(
                "ptolemaic",
                "retrograde",
                "supplant",
                "undulate",
                "xenoepist",
                "zenith",
                "asymptote",
                "babka",
                "banoffee",
                "engender"
            )
        )
    }
}