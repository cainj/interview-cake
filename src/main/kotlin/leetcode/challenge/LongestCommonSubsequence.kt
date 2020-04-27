package leetcode.challenge

import kotlin.math.max

class LongestCommonSubsequence {
    private var max = 0
    private var score = 0

    fun longestCommonSubsequence(text1: String, text2: String): Int {
        val m = text1.length
        val n = text2.length

        val lcs = Array(m + 1) { IntArray(n + 1) }

        for (i in 1 .. m)
            for (j in 1 .. n)
                if (text1[i - 1] == text2[j - 1])
                    lcs[i][j] = 1 + lcs[i - 1][j - 1]
                else
                    lcs[i][j] = max(lcs[i][j - 1], lcs[i - 1][j])

        return lcs[m][n]
    }
}