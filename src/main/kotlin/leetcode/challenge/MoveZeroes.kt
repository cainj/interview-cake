package leetcode.challenge

class MoveZeroes {

    fun moveZeroes(nums: IntArray): IntArray {

        var lastKnownZero = findZero(nums, 0)
        var i = lastKnownZero

        while (i < nums.size && lastKnownZero != -1) {
            if (nums[i] != 0) {
                nums[lastKnownZero] = nums[i]
                nums[i] = 0
                lastKnownZero = findZero(nums, lastKnownZero)
                i = lastKnownZero
            }
            i++
        }
        return nums
    }

    private fun findZero(nums: IntArray, last: Int): Int {
        for (i in last until nums.size)
            if (nums[i] == 0)
                return i
        return -1
    }
}
