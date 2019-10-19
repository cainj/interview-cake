package interviewcake

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class ChangePossibilitiesTest {
    @Test
    fun sampleInputTest2() {
        val cp = ChangePossibilities()
        val actual = cp.changePossibilities(4, intArrayOf(1, 2))
        val expected = 2
        assertEquals(expected, actual)
    }

    @Test
    fun sampleInputTest() {
        val cp = ChangePossibilities()
        val actual = cp.changePossibilities(5, intArrayOf(1, 2))
        val expected = 3
        assertEquals(expected, actual)
    }

    @Test
    fun oneWayToMakeZeroCentsTest() {
        val cp = ChangePossibilities()
        val actual = cp.changePossibilities(0, intArrayOf(1, 2))
        val expected = 1
        assertEquals(expected, actual)
    }

    @Test
    fun noWaysIfNoCoinsTest() {
        val cp = ChangePossibilities()
        val actual = cp.changePossibilities(1, intArrayOf())
        val expected = 0
        assertEquals(expected, actual)
    }

    @Test
    fun bigCoinValueTest() {
        val cp = ChangePossibilities()
        val actual = cp.changePossibilities(5, intArrayOf(25, 50))
        val expected = 0
        assertEquals(expected, actual)
    }

    @Test
    fun bigTargetAmountTest() {
        val cp = ChangePossibilities()
        val actual = cp.changePossibilities(50, intArrayOf(5, 10))
        val expected = 6
        assertEquals(expected, actual)
    }

    @Test
    fun changeForOneDollarTest() {
        val cp = ChangePossibilities()
        val actual = cp.changePossibilities(100, intArrayOf(1, 5, 10, 25, 50))
        val expected = 292
        assertEquals(expected, actual)
    }

}