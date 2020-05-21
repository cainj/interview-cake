package leetcode.arrays

class DominantIndex {
    fun dominantIndex(nums: IntArray): Int {

        var largest = 0
        var secondLargest = largest
        var index = 0

        for (i in nums.indices)
            if (nums[i] > largest) {
                index = i
                secondLargest = largest
                largest = nums[i]
            } else if (nums[i] > secondLargest) secondLargest = nums[i]

        return if (largest >= secondLargest * 2) index else -1
    }
}
