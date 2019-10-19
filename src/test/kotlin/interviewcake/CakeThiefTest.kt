package interviewcake

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

class CakeThiefTest {

    @Test
    fun oneCakeTest() {
        val cakeTypes = arrayOf(CakeType(2, 1))
        val weightCapacity = 9
        val expected: Long = 4
        val actual = maxDuffelBagValue(cakeTypes, weightCapacity)
        assertEquals(expected, actual)
    }

    @Test
    fun twoCakesTest() {
        val cakeTypes = arrayOf(CakeType(4, 4), CakeType(5, 5))
        val weightCapacity = 9
        val expected: Long = 9
        val actual = maxDuffelBagValue(cakeTypes, weightCapacity)
        assertEquals(expected, actual)
    }

    @Test
    fun onlyTakeLessValuableCakeTest() {
        val cakeTypes = arrayOf(CakeType(4, 4), CakeType(5, 5))
        val weightCapacity = 12
        val expected: Long = 12
        val actual = maxDuffelBagValue(cakeTypes, weightCapacity)
        assertEquals(expected, actual)
    }

    @Test
    fun lotsOfCakesTest() {
        val cakeTypes =
            arrayOf(CakeType(2, 3), CakeType(3, 6), CakeType(5, 1), CakeType(6, 1), CakeType(7, 1), CakeType(8, 1))
        val weightCapacity = 7
        val expected: Long = 12
        val actual = maxDuffelBagValue(cakeTypes, weightCapacity)
        assertEquals(expected, actual)
    }

    @Test
    fun valueToWeightRatioIsNotOptimalTest() {
        val cakeTypes = arrayOf(CakeType(51, 52), CakeType(50, 50))
        val weightCapacity = 100
        val expected: Long = 100
        val actual = maxDuffelBagValue(cakeTypes, weightCapacity)
        assertEquals(expected, actual)
    }

    @Test
    fun zeroCapacityTest() {
        val cakeTypes = arrayOf(CakeType(1, 2))
        val weightCapacity = 0
        val expected: Long = 0
        val actual = maxDuffelBagValue(cakeTypes, weightCapacity)
        assertEquals(expected, actual)
    }

    @Test
    fun cakeWithZeroValueAndWeightTest() {
        val cakeTypes = arrayOf(CakeType(0, 0), CakeType(2, 1))
        val weightCapacity = 7
        val expected: Long = 3
        val actual = maxDuffelBagValue(cakeTypes, weightCapacity)
        assertEquals(expected, actual)
    }

    @Test
    fun cakeWithNonZeroValueAndZeroWeightTest() {
        val cakeTypes = arrayOf(CakeType(0, 5))
        val weightCapacity = 5
        assertThrows(Exception::class.java) { maxDuffelBagValue(cakeTypes, weightCapacity) }
    }
}
