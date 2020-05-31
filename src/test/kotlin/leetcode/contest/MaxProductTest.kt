package leetcode.contest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MaxProductTest {

    @Test
    fun maxProduct() {
        val mp = MaxProduct()
        assertEquals(16, mp.maxProduct(intArrayOf(1, 5, 4, 5)))
        assertEquals(12, mp.maxProduct(intArrayOf(3, 7)))
        assertEquals(12, mp.maxProduct(intArrayOf(3, 4, 5, 2)))
    }
}
