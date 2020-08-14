package leetcode.challenge.august

class LongestPalindrome {

    fun longestPalindrome(s: String): Int {
        val countMap = hashMapOf<Char, Int>()
        var ans = 0

        for (c in s)
            countMap[c] = countMap.getOrDefault(c, 0) + 1

        var maxOddValue = 0
        for ((c, count) in countMap) {
            if (count % 2 == 0) ans += count
            else {
                when {
                    maxOddValue == 0 -> {
                        ans += count
                        maxOddValue = count
                    }
                    maxOddValue < count -> {
                        ans--
                        ans += count
                        maxOddValue = count
                    }
                    else -> ans += (count - 1)
                }
            }
        }
        return ans
    }
}
