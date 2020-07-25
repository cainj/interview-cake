package leetcode.challenge.july

class SingleNumberIII {

    fun singleNumber(nums: IntArray): IntArray {
        val ans = hashSetOf<Int>()

        for (num in nums) {
            if (ans.contains(num)) ans.remove(num)
            else ans.add(num)
        }

        return if (ans.isNotEmpty()) ans.toIntArray() else intArrayOf(0, 0)
    }
}
