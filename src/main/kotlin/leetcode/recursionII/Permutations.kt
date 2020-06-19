package leetcode.recursionII

import java.util.*
import kotlin.collections.ArrayList

class Permutations {
    private val ans = mutableListOf<List<Int>>()

    fun permute(nums: IntArray): List<List<Int>> {
        val arr = ArrayList<Int>()

        for (n in nums)
            arr.add(n)

        permutations(arr, 0)


        return ans
    }

    private fun permutations(nums: ArrayList<Int>, n: Int) {
        if (n == nums.size) {
            ans.add(ArrayList<Int>(nums))
            return
        }

        for (i in n until nums.size) {
            Collections.swap(nums, n, i)
            permutations(nums, n + 1)
            Collections.swap(nums, n, i)
        }
    }

}
