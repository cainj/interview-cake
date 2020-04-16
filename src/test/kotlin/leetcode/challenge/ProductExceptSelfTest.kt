package leetcode.challenge

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class ProductExceptSelfTest {

    @Test
    fun productExceptSelf() {
        val pes = ProductExceptSelf()
        assertArrayEquals(intArrayOf(24, 12, 8, 6), pes.productExceptSelf(intArrayOf(1, 2, 3, 4)))
        assertArrayEquals(
            intArrayOf(540, 18000, 10800, 6000, 13500),
            pes.productExceptSelf(intArrayOf(100, 3, 5, 9, 4))
        )
    }
}