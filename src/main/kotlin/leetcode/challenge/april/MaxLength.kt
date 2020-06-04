package leetcode.challenge.april

import kotlin.math.max

class MaxLength {

    fun findMaxLengthBrute(nums: IntArray): Int {
        var max = 0
        for (j in nums.indices) {
            var zeros = 0
            var ones = 0
            for (i in j until nums.size) {
                if (nums[i] == 0)
                    zeros++
                else
                    ones++

                if (zeros == ones && i != 0)
                    max = max(max, i - j + 1)
            }
        }

        return max
    }

    fun findMaxLength(nums: IntArray): Int {
        var sum = 0
        var max = 0
        val map = hashMapOf<Int, Int>()

        for (i in nums.indices) {
            if (nums[i] == 0)
                sum--
            else
                sum++

            if (sum == 0)
                max = i + 1


            if (map.contains(sum))
                max = max(max, i - map[sum]!!)
            else
                map[sum] = i
        }

        return max
    }
}
