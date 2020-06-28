package leetcode.challenge.june

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CreateItineraryTest {

    @Test
    fun findItinerary() {
        val createItinerary = CreateItinerary()
        assertEquals(
            listOf("JFK", "MUC", "LHR", "SFO", "SJC"),
            createItinerary.findItinerary(
                listOf(
                    listOf("MUC", "LHR"),
                    listOf("JFK", "MUC"),
                    listOf("SFO", "SJC"),
                    listOf("LHR", "SFO")
                )
            )
        )
        assertEquals(
            listOf("JFK", "ATL", "JFK", "SFO", "ATL", "SFO"),
            createItinerary.findItinerary(
                listOf(
                    listOf("JFK", "SFO"),
                    listOf("JFK", "ATL"),
                    listOf("SFO", "ATL"),
                    listOf("ATL", "JFK"),
                    listOf("ATL", "SFO")
                )
            )
        )
    }
}
