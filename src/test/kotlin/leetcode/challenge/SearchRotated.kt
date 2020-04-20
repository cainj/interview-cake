package leetcode.challenge

class SearchRotated {

    fun search(nums: IntArray, target: Int): Int {

        if(nums.isEmpty())
            return -1

        var pivot = 0

        for (i in 0 until nums.size - 1) {
            if (nums[i] > nums[i + 1]) {
                pivot = i
                break
            }
        }

        val ans = binarySearch(0, pivot, target, nums)

        return if (ans > -1)
            ans
        else
            binarySearch(pivot + 1, nums.size - 1, target, nums)
    }

    private fun binarySearch(l: Int, r: Int, target: Int, nums: IntArray): Int {
        var left = l
        var right = r

        while (left <= right) {
            val mid = left + (right - left) / 2
            when {
                nums[mid] == target -> return mid
                nums[mid] < target -> left = mid + 1
                else -> right = mid - 1
            }
        }

        return -1
    }
}
