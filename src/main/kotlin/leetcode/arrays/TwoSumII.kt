package leetcode.arrays

class TwoSumII {

    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var low = 0
        var high = numbers.size - 1

        while (low < high) {
            val sum = numbers[high] + numbers[low]
            when {
                sum == target -> return intArrayOf(low + 1, high + 1)
                sum > target -> high--
                else -> low++
            }
        }

        return intArrayOf(-1, -1)
    }
}
