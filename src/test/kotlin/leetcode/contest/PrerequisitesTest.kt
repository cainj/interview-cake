package leetcode.contest

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class PrerequisitesTest {

    @Test
    fun checkIfPrerequisite() {
        val cp = Prerequisites()

        assertArrayEquals(
            booleanArrayOf(false, true),
            cp.checkIfPrerequisite(arrayOf(intArrayOf(1, 0)), arrayOf(intArrayOf(0, 1), intArrayOf(1, 0)))
        )
        assertArrayEquals(
            booleanArrayOf(false, false),
            cp.checkIfPrerequisite(arrayOf(), arrayOf(intArrayOf(0, 1), intArrayOf(1, 0)))
        )
        assertArrayEquals(
            booleanArrayOf(true, false, true, false),
            cp.checkIfPrerequisite(
                arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4)),
                arrayOf(intArrayOf(0, 4), intArrayOf(4, 0), intArrayOf(1, 3), intArrayOf(3, 0))
            )
        )
    }
}
