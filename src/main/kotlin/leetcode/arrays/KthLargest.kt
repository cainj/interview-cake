package leetcode.arrays

import java.util.*

class KthLargest {

    //Time complexity is O(n log N)
    //Space complexity is O(1)
    fun findKthLargestSort(nums: IntArray, k: Int): Int {
        if (k > nums.size) return -1
        nums.sort()
        return nums[nums.size - k]
    }

    //Time complexity is O(N logk)
    //Space complexity is O(k)
    fun findKthLargest(nums: IntArray, k: Int): Int {
        if (k > nums.size) return -1
        val queue = PriorityQueue<Int>()

        for (n in nums) {
            queue.offer(n)
            if (queue.size > k) {
                queue.poll()
            }
        }

        return queue.peek()
    }
}
