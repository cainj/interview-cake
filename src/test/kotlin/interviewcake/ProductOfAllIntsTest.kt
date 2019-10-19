package interviewcake

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test



class ProductOfAllIntsTest {


    // tests

    @Test
    fun smallArrayTest() {
        val actual = getProductsOfAllIntsExceptAtIndex(intArrayOf(1, 2, 3))
        val expected = intArrayOf(6, 3, 2)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun longArrayTest() {
        val actual = getProductsOfAllIntsExceptAtIndex(intArrayOf(8, 2, 4, 3, 1, 5))
        val expected = intArrayOf(120, 480, 240, 320, 960, 192)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun arrayHasOneZeroTest() {
        val actual = getProductsOfAllIntsExceptAtIndex(intArrayOf(6, 2, 0, 3))
        val expected = intArrayOf(0, 0, 36, 0)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun arrayHasTwoZerosTest() {
        val actual = getProductsOfAllIntsExceptAtIndex(intArrayOf(4, 0, 9, 1, 0))
        val expected = intArrayOf(0, 0, 0, 0, 0)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun oneNegativeNumberTest() {
        val actual = getProductsOfAllIntsExceptAtIndex(intArrayOf(-3, 8, 4))
        val expected = intArrayOf(32, -12, -24)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun allNegativeNumbersTest() {
        val actual = getProductsOfAllIntsExceptAtIndex(intArrayOf(-7, -1, -4, -2))
        val expected = intArrayOf(-8, -56, -14, -28)
        assertArrayEquals(expected, actual)
    }

//    @Test(expected = Exception::class)
//    fun exceptionWithEmptyArrayTest() {
//        getProductsOfAllIntsExceptAtIndex(intArrayOf())
//    }
//
//    @Test(expected = Exception::class)
//    fun exceptionWithOneNumberTest() {
//        getProductsOfAllIntsExceptAtIndex(intArrayOf(1))
//    }

}
