package interviewcake

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class CanTwoMoviesFillFlightTest {

    @Test
    fun shortFlightTest() {
        val result = canTwoMoviesFillFlight(intArrayOf(2, 4), 1)
        assertFalse(result)
    }

    @Test
    fun longFlightTest() {
        val result = canTwoMoviesFillFlight(intArrayOf(2, 4), 6)
        assertTrue(result)
    }

    @Test
    fun onlyOneMovieHalfFlightLenghtTest() {
        val result = canTwoMoviesFillFlight(intArrayOf(3, 8), 6)
        assertFalse(result)
    }

    @Test
    fun twoMoviesHalfFlightLengthTest() {
        val result = canTwoMoviesFillFlight(intArrayOf(3, 8, 3), 6)
        assertTrue(result)
    }

    @Test
    fun lotsOfPossiblePairsTest() {
        val result = canTwoMoviesFillFlight(intArrayOf(1, 2, 3, 4, 5, 6), 7)
        assertTrue(result)
    }

    @Test
    fun notUsingFirstMovieTest() {
        val result = canTwoMoviesFillFlight(intArrayOf(4, 3, 2), 5)
        assertTrue(result)
    }

    @Test
    fun oneMovieTest() {
        val result = canTwoMoviesFillFlight(intArrayOf(6), 6)
        assertFalse(result)
    }

    @Test
    fun noMoviesTest() {
        val result = canTwoMoviesFillFlight(intArrayOf(), 6)
        assertFalse(result)
    }
}