package leetcode.binarysearch

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FirstBadVersionTest {

    @Test
    fun firstBadVersion() {
        var fbv = FirstBadVersion(2)
        assertEquals(2, fbv.firstBadVersion(2))
        fbv = FirstBadVersion(1)
        assertEquals(1, fbv.firstBadVersion(2))
        fbv = FirstBadVersion(4)
        assertEquals(4, fbv.firstBadVersion(10))
    }
}
