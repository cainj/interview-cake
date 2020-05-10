package leetcode.arrays

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class BuildArrayStackOpsTest {

    @Test
    fun buildArray() {
        val arrayOps = BuildArrayStackOps()
        assertEquals(listOf("Push", "Push", "Pop", "Push"), arrayOps.buildArray(intArrayOf(1, 3), 3))
        assertEquals(listOf("Push", "Push", "Push"), arrayOps.buildArray(intArrayOf(1, 2, 3), 3))
        assertEquals(listOf("Push", "Push"), arrayOps.buildArray(intArrayOf(1, 2), 4))
        assertEquals(listOf("Push", "Pop", "Push", "Push", "Push"), arrayOps.buildArray(intArrayOf(2, 3, 4), 4))

    }
}
