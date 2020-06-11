package leetcode.challenge.june

class SearchInserted {

    fun searchInsert(nums: IntArray, target: Int): Int {
        if (nums.isEmpty()) return 0

        var l = 0
        var r = nums.size

        while (l < r) {
            val mid = l + (r - l) / 2

            when {
                nums[mid] == target -> return mid
                target < nums[mid] -> r = mid
                else -> l = mid + 1
            }
        }

        if (l == nums.size) l--
        return if (nums[l] < target) ++l else l
    }
}
