package interviewcake

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class CafeOrderCheckerTest {

    // tests

    @Test
    fun bothRegistersHaveSameNumberOfOrdersTest() {
        val takeOutOrders = intArrayOf(1, 4, 5)
        val dineInOrders = intArrayOf(2, 3, 6)
        val servedOrders = intArrayOf(1, 2, 3, 4, 5, 6)
        val result = isFirstComeFirstServed(takeOutOrders, dineInOrders, servedOrders)
        assertTrue(result)
    }

//    @Test
//    fun registersHaveDifferentLengthsTest() {
//        val takeOutOrders = intArrayOf(1, 5)
//        val dineInOrders = intArrayOf(2, 3, 6)
//        val servedOrders = intArrayOf(1, 2, 6, 3, 5)
//        val result = isFirstComeFirstServed(takeOutOrders, dineInOrders, servedOrders)
//        assertFalse(result)
//    }
//
//    @Test
//    fun oneRegisterIsEmptyTest() {
//        val takeOutOrders = intArrayOf()
//        val dineInOrders = intArrayOf(2, 3, 6)
//        val servedOrders = intArrayOf(2, 3, 6)
//        val result = isFirstComeFirstServed(takeOutOrders, dineInOrders, servedOrders)
//        assertTrue(result)
//    }
//
//    @Test
//    fun servedOrdersIsMissingOrdersTest() {
//        val takeOutOrders = intArrayOf(1, 5)
//        val dineInOrders = intArrayOf(2, 3, 6)
//        val servedOrders = intArrayOf(1, 6, 3, 5)
//        val result = isFirstComeFirstServed(takeOutOrders, dineInOrders, servedOrders)
//        assertFalse(result)
//    }
//
//    @Test
//    fun servedOrdersHasExtraOrders() {
//        val takeOutOrders = intArrayOf(1, 5)
//        val dineInOrders = intArrayOf(2, 3, 6)
//        val servedOrders = intArrayOf(1, 2, 3, 5, 6, 8)
//        val result = isFirstComeFirstServed(takeOutOrders, dineInOrders, servedOrders)
//        assertFalse(result)
//    }
//
//    @Test
//    fun oneRegisterHasExtraOrders() {
//        val takeOutOrders = intArrayOf(1, 9)
//        val dineInOrders = intArrayOf(7, 8)
//        val servedOrders = intArrayOf(1, 7, 8)
//        val result = isFirstComeFirstServed(takeOutOrders, dineInOrders, servedOrders)
//        assertFalse(result)
//    }
//
//
//    @Test
//    fun oneRegisterHasUnservedOrders() {
//        val takeOutOrders = intArrayOf(55, 9)
//        val dineInOrders = intArrayOf(7, 8)
//        val servedOrders = intArrayOf(1, 7, 8, 9)
//        val result = isFirstComeFirstServed(takeOutOrders, dineInOrders, servedOrders)
//        assertFalse(result)
//    }

}