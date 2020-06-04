package leetcode.challenge.april

import kotlin.math.max

class CanJump {

    fun canJump(nums: IntArray): Boolean {
        //[2,3,1,0,0,2,0,4]
        //i = 0
        //window = [2, 3, 1]
        // i = 1, maxJump = 2
        //window = [2, 3, 1, 0, 0]
        // i = 2, maxJump = 4
        //window = [2, 3, 1, 0,0]
        // i = 3, maxJump = 4
        // window no change
        // i == maxJump / break

        val goal = nums.size - 1
        var maxJump = 0

        for (i in nums.indices) {
            maxJump = max(maxJump, nums[i] + i)
            if (maxJump >= goal)
                return true

            if (maxJump == i)
                break
        }

        return false
    }
}
