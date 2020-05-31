package leetcode.contest

class MaxProduct {

    fun maxProduct(nums: IntArray): Int {
        var largest = 0
        var second = 1

        if (nums[1] >= nums[0]) {
            largest = 1
            second = 0
        }


        for (i in 2 until nums.size)
            if (nums[i] >= nums[largest]) {
                second = largest
                largest = i
            } else if (nums[i] >= nums[second])
                second = i

        return (nums[largest] - 1) * (nums[second] - 1)
    }
}
