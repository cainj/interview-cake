package leetcode.contest

/**
 * Given the array of integers nums, you will choose two different indices i and j of that array.
 * Return the maximum value of (nums[i]-1)*(nums[j]-1).
 *
 * Example 1:
 * Input: nums = [3,4,5,2]
 * Output: 12
 *
 * Example B:
 * Input: nums = [3,7]
 * Output: 12
 *
 * Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value,
 * that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.
 *
 * Constraints:
 * 2 <= nums.length <= 500
 * 1 <= nums[i] <= 10^3
 */
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
