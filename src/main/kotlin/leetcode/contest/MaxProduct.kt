package leetcode.contest

class MaxProduct {

    fun maxProduct(nums: IntArray): Int {
        var largest = 1
        var second = Int.MIN_VALUE

        for (i in nums.indices)
            if (nums[i] >= largest) {
                second = largest
                largest = nums[i]
            } else if (nums[i] >= second)
                second = nums[i]

        return (largest - 1) * (second - 1)
    }
}
