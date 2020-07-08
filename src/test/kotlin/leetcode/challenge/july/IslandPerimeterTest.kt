package leetcode.challenge.july

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class IslandPerimeterTest {

    @Test
    fun islandPerimeter() {
        val ip = IslandPerimeter()
        assertEquals(
            16, ip.islandPerimeter(
                arrayOf(
                    intArrayOf(0, 1, 0, 0),
                    intArrayOf(1, 1, 1, 0),
                    intArrayOf(0, 1, 0, 0),
                    intArrayOf(1, 1, 0, 0)
                )
            )
        )
        assertEquals(4, ip.islandPerimeter(arrayOf(intArrayOf(1))))
        assertEquals(
            0, ip.islandPerimeter(
                arrayOf()
            )
        )
    }
}
