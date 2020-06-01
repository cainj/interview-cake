package leetcode.recursionII

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class RobotCleanerTest {

    @Test
    fun cleanRoom() {
        val robotCleaner = RobotCleaner()
        var room = arrayOf(intArrayOf(1, 1), intArrayOf(1, 1))
        robotCleaner.cleanRoom(Robot(room, 0, 0))
        assertArrayEquals(arrayOf(intArrayOf(2, 2), intArrayOf(2, 2)), room)
        room = arrayOf(intArrayOf(1, 1), intArrayOf(1, 0))
        robotCleaner.cleanRoom(Robot(room, 1, 0))
        assertArrayEquals(arrayOf(intArrayOf(2, 2), intArrayOf(2, 0)), room)
        room = arrayOf(
            intArrayOf(1, 1, 1, 1, 1, 0, 1, 1),
            intArrayOf(1, 1, 1, 1, 1, 0, 1, 1),
            intArrayOf(1, 0, 1, 1, 1, 1, 1, 1),
            intArrayOf(0, 0, 0, 1, 0, 0, 0, 0),
            intArrayOf(1, 1, 1, 1, 1, 1, 1, 1)
        )
        robotCleaner.cleanRoom(Robot(room, 1, 3))
        room.forEach { println(it.toList()) }
        assertArrayEquals(
            arrayOf(
                intArrayOf(2, 2, 2, 2, 2, 0, 2, 2),
                intArrayOf(2, 2, 2, 2, 2, 0, 2, 2),
                intArrayOf(2, 0, 2, 2, 2, 2, 2, 2),
                intArrayOf(0, 0, 0, 2, 0, 0, 0, 0),
                intArrayOf(2, 2, 2, 2, 2, 2, 2, 2)
            )
            ,room)
    }
}
