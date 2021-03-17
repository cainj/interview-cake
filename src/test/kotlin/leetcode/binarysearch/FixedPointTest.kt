package leetcode.binarysearch

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FixedPointTest {

    @Test
    fun fixedPoint() {
        val fixedPoint = FixedPoint()
        assertEquals(2, fixedPoint.fixedPoint(intArrayOf(-10, -5, 2, 4, 67)))
        assertEquals(-1, fixedPoint.fixedPoint(intArrayOf(-10, -5, -2, 4, 6)))
    }
}
/**
 * l = 0
 * r = arr.size - 1
 * while(l <= r)
 *  mid = l + (r - l) / 2
 *  if(arr[mid] == target) return target
 *  else if(arr[mid] < target) l = mid + 1
 *  else r = mid
 */
