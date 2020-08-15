package leetcode.binarysearch

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CapacityShipPackagesTest {

    @Test
    fun shipWithinDays() {
        val capacity = CapacityShipPackages()
        assertEquals(15, capacity.shipWithinDays(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 5))
        assertEquals(6, capacity.shipWithinDays(intArrayOf(3, 2, 2, 4, 1, 4), 3))
        assertEquals(3, capacity.shipWithinDays(intArrayOf(1,2,3,1,1), 4))
    }
}
