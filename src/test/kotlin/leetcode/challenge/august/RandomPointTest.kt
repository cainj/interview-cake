package leetcode.challenge.august

import org.junit.jupiter.api.Test

internal class RandomPointTest {

    @Test
    fun pick() {
        val rp = RandomPoint(arrayOf(intArrayOf(1, 1, 5, 5)))
        rp.pick()
    }
}
