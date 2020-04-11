package leetcode.challenge

class SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        val set = hashSetOf<Int>()
        for (n in nums)
            if (set.contains(n))
                set.remove(n)
            else
                set.add(n)

        return set.single()
    }

    fun singleNumberSort(nums: IntArray): Int {
        nums.sort()
        for (i in 0 until nums.size - 2 step 2)
            if (nums[i] != nums[i + 1]) {
                return when {
                    i == 0 -> nums[0]
                    nums[i - 1] != nums[i] -> nums[i]
                    else -> nums[i + 1]
                }
            }

        return nums[nums.size - 1]
    }

    //Cheeky I didn't figure this out
    fun singleNumberBit(nums: IntArray): Int {
        var a = 0
        for (i in nums) {
            a = a xor i
        }
        return a
    }
}
