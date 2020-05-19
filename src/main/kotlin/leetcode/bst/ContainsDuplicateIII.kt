package leetcode.bst

import java.util.*

class ContainsDuplicateIII {

    //Time complexity: O(n log(n, k))
    //Space complexity: O(min(n, k))

    fun containsNearbyAlmostDuplicate(nums: IntArray, k: Int, t: Int): Boolean {
        val tree = TreeSet<Long>()

        for (i in nums.indices) {
            val floor = tree.floor(nums[i].toLong())
            if (floor != null && nums[i] - floor <= t)
                return true

            val ceiling = tree.ceiling(nums[i].toLong())
            if (ceiling != null && ceiling - nums[i] <= t)
                return true

            tree.add(nums[i].toLong())
            if (tree.size > k) tree.remove(nums[i - k].toLong())

        }

        return false
    }
}
