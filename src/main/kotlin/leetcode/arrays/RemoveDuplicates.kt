package leetcode.arrays

class RemoveDuplicates {

    fun removeDuplicates(nums: IntArray): Int {
        var k = 0

        for (i in nums.indices)
            if (nums[i] != nums[k]) {
                k++
                nums[k] = nums[i]
            }

        return k + 1
    }
}
