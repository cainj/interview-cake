package leetcode.challenge.august

import java.util.*

class RandomPoint(private val rects: Array<IntArray>) {
    private val range: IntArray = IntArray(rects.size + 1)

    fun pick(): IntArray {
        val num = pickRect()
        val x: Int = Random().nextInt(rects[num][2] - rects[num][0] + 1) + rects[num][0]
        val y: Int = Random().nextInt(rects[num][3] - rects[num][1] + 1) + rects[num][1]
        return intArrayOf(x, y)
    }

    private fun pickRect(): Int {
        val randomArea: Int = Random().nextInt(range[range.size - 1])
        var left = 0
        var right = range.size - 1
        while (left < right) {
            val mid = left + (right - left) / 2
            if (randomArea >= range[mid] && randomArea < range[mid + 1]) return mid
            if (randomArea > range[mid]) left = mid + 1
            else right = mid
        }

        return left
    }

    init {
        for (i in rects.indices) {
            if (rects[i].isEmpty()) continue
            val area = (rects[i][2] - rects[i][0] + 1) * (rects[i][3] - rects[i][1] + 1)
            range[i + 1] += range[i] + area
        }
    }
}
