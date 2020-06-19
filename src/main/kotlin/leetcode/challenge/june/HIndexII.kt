package leetcode.challenge.june

class HIndexII {

    fun hIndex(citations: IntArray): Int {
        if (citations.isEmpty()) return 0

        var l = 0
        var r = citations.size - 1

        while (l <= r) {
            val mid = l + (r - l) / 2

            when {
                citations[mid] == citations.size - mid -> return citations.size - mid
                citations[mid] < citations.size - mid -> l = mid + 1
                else -> r = mid - 1
            }
        }

        return citations.size - l
    }
}
