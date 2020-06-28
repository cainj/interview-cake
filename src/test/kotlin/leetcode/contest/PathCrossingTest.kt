package leetcode.contest

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PathCrossingTest {

    @Test
    fun isPathCrossing() {
        val pathCross = PathCrossing()
        assertEquals(false, pathCross.isPathCrossing("NES"))
        assertEquals(false, pathCross.isPathCrossing("NNESSEESSWW"))
        assertEquals(true, pathCross.isPathCrossing("NWES"))
        assertEquals(true, pathCross.isPathCrossing("NESWW"))
        assertEquals(true, pathCross.isPathCrossing("NWESWW"))

    }
}
