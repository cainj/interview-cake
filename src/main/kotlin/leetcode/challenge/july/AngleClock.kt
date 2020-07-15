package leetcode.challenge.july

import kotlin.math.abs

class AngleClock {

    fun angleClock(hour: Int, minutes: Int): Double {

        val bighand = hour % 12 * 30 + minutes.toDouble() / 2
        val smallhand = (minutes * 6).toDouble()

        var ans = abs(bighand - smallhand)
        return minOf(ans, 360 - ans)
    }
}
