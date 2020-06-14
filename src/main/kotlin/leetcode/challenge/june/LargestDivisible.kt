package leetcode.challenge.june

class LargestDivisible {

    fun largestDivisibleSubset(nums: IntArray): List<Int> {
        val result = List(nums.size) { mutableListOf<Int>() }
        if (result.size <= 1) return nums.toList()

        nums.sort()
        var maxLen = 1
        var maxIndex = 0

        for (i in (nums.size - 1) downTo 0) {
            result[i].add(nums[i])
            var max = 0
            var maxId = i
            for (j in (i + 1) until nums.size) {
                if (nums[j] % nums[i] == 0 && result[j].size > max) {
                    max = result[j].size
                    maxId = j
                }
            }
            if (maxId != i)
                result[i].addAll(result[maxId])
            if (max + 1 > maxLen) {
                maxLen = max + 1
                maxIndex = i
            }
        }

        return result[maxIndex]
    }
}
