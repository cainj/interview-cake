package leetcode.contest

class CountingSubStrings {

    fun numSub(s: String): Int {
        val mod = 1e9 + 7

        var count = 0
        var res = 0

        for (i in s.indices) {
            if (s[i] == '1') count++
            else count = 0

            res = ((res + count) % mod).toInt()
        }

        return res
    }
}
