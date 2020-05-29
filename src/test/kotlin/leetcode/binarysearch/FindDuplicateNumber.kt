package leetcode.binarysearch

class FindDuplicateNumber {

    fun findDuplicate(nums: IntArray): Int {
        if (nums.isEmpty()) return -1

        var slow = nums[0]
        var fast = slow

        slow = nums[slow]
        fast = nums[nums[fast]]

        while (fast != slow) {
            slow = nums[slow]
            fast = nums[nums[fast]]
        }

        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow
    }
}
