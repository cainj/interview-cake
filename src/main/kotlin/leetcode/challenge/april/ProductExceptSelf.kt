package leetcode.challenge.april

class ProductExceptSelf {

    fun productExceptSelf(nums: IntArray): IntArray {

        val ans = IntArray(nums.size) { 0 }
        var right = 1
        ans[0] = 1

        for (i in 1 until nums.size)
            ans[i] = ans[i - 1] * nums[i - 1]

        for (i in nums.size - 1 downTo 0) {
            ans[i] = right * ans[i]
            right *= nums[i]
        }

        return ans
    }
}
