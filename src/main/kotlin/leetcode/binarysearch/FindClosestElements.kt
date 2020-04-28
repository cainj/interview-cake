package leetcode.binarysearch

class FindClosestElements {

    // Runtime is O(log n + k)
    // Space complexity is O(k)
    fun findClosestElements(arr: IntArray, k: Int, x: Int): List<Int>? {
        val n = arr.size
        return when {
            x <= arr[0] -> arr.copyOfRange(0, k).toList()
            arr[n - 1] <= x -> arr.copyOfRange(n - k, n).toList()
            else -> {
                var index = arr.binarySearch(x)
                if (index < 0) index = -index - 1
                var low = 0.coerceAtLeast(index - k - 1)
                var high = (arr.size - 1).coerceAtMost(index + k - 1)
                while (high - low > k - 1) {
                    if (low < 0 || x - arr[low] <= arr[high] - x)
                        high--
                    else if (high > arr.size - 1 || x - arr[low] > arr[high] - x)
                        low++
                    else println("unhandled case: $low $high")
                }
                arr.copyOfRange(low, high + 1).toList()
            }
        }
    }
}
