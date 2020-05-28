package leetcode.arrays

class RotateArray {

    fun rotate(nums: IntArray, k: Int): Unit {
        val slice = k % nums.size
        reverse(nums, 0, nums.size - 1)
        reverse(nums, 0, slice - 1)
        reverse(nums, slice, nums.size - 1)
    }

    private fun reverse(nums: IntArray, i: Int, j: Int) {

        var start = i
        var end = j

        while (start < end) {

            val hold = nums[start]
            nums[start] = nums[end]
            nums[end] = hold
            start++
            end--
        }
    }

}
