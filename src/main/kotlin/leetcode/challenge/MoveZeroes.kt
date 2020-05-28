package leetcode.challenge

class MoveZeroes {

    fun moveZeroes(nums: IntArray): IntArray {
        var zeros = 0

        while (zeros < nums.size - 1) {
            if (nums[zeros] != 0) zeros++
            else {
                var i = zeros
                while (i < nums.size) {
                    if (nums[i] != 0) {
                        val hold = nums[i]
                        nums[i] = nums[zeros]
                        nums[zeros] = hold
                        break
                    }
                    i++
                }
                zeros++
            }
        }

        return nums
    }
}
