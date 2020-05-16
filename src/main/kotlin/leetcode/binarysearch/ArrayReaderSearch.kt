package leetcode.binarysearch

class ArrayReaderSearch(nums: IntArray) {

    internal class ArrayReader(private val nums: IntArray) {
        fun get(index: Int): Int =
            if (index > nums.size - 1) Int.MAX_VALUE
            else nums[index]
    }

    private val reader = ArrayReader(nums)

    fun search(target: Int): Int {
        var l = 0
        var r = Int.MAX_VALUE

        while (l + 1 < r) {
            val mid = l + (r - l) / 2
            val guess = reader.get(mid)
            if (guess == target) return mid
            else if (guess == Int.MAX_VALUE || guess > target) r = mid
            else l = mid
        }

        return if (reader.get(l) == target) l else -1
    }
}
