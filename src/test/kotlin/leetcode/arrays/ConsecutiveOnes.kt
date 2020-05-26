package leetcode.arrays

import kotlin.math.max

class ConsecutiveOnes {

    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var max = 0
        var consecutive = 0

        for (i in nums) {
            if (i == 1) consecutive++
            else {
                max = max(max, consecutive)
                consecutive = 0
            }
        }

        return if (nums[nums.size - 1] == 1) max(max, consecutive) else max
    }
}
