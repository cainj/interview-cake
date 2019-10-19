package interviewcake

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test



class TopScoresTest {

    @Test
    fun noScoresTest() {
        val scores = intArrayOf()
        val expected = intArrayOf()
        val actual = sortScores(scores, 100)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun oneScoreTest() {
        val scores = intArrayOf(55)
        val expected = intArrayOf(55)
        val actual = sortScores(scores, 100)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun twoScoresTest() {
        val scores = intArrayOf(30, 60)
        val expected = intArrayOf(60, 30)
        val actual = sortScores(scores, 100)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun manyScoresTest() {
        val scores = intArrayOf(37, 89, 41, 65, 91, 53)
        val expected = intArrayOf(91, 89, 65, 53, 41, 37)
        val actual = sortScores(scores, 100)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun repeatedScoresTest() {
        val scores = intArrayOf(20, 10, 30, 30, 10, 20)
        val expected = intArrayOf(30, 30, 20, 20, 10, 10)
        val actual = sortScores(scores, 100)
        assertArrayEquals(expected, actual)
    }
}