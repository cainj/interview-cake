package leetcode.contest

/**
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */
class ShuffleArray {

    fun shuffle(nums: IntArray, n: Int): IntArray {
        require(nums.size == 2 * n)

        val ans = IntArray(nums.size)
        for (i in 0 until n) {
            ans[2 * i] = nums[i]
            ans[2 * i + 1] = nums[i + n]
        }

        return ans
    }
}
