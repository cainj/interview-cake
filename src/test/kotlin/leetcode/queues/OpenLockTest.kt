package leetcode.queues

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class OpenLockTest {

    @Test
    fun openLock() {
        val lock = OpenLock()
        assertEquals(-1, lock.openLock(arrayOf("0000"), "8888"))
        assertEquals(-1, lock.openLock(arrayOf("8887", "8889", "8878", "8898", "8788", "8988", "7888", "9888"), "8888"))
        assertEquals(1, lock.openLock(arrayOf("8888"), "0009"))
        assertEquals(6, lock.openLock(arrayOf("0201", "0101", "0102", "1212", "2002"), "0202"))
    }
}
