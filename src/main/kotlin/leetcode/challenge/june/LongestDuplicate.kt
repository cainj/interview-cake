package leetcode.challenge.june

import java.util.*


class LongestDuplicate {

    fun longestDupSubstring(S: String): String {
        var max = ""
        var l = 0
        var r = S.length - 1

        while (l <= r) {
            val mid = l + (r - l) / 2
            val curr = rabinKarp(mid, S)

            if (curr != null) {
                max = curr
                l = mid + 1
            } else r = mid - 1
        }

        return max
    }


    private fun rabinKarp(size: Int, s: String): String? {
        var hash = hash(s.substring(0, size))
        val set: HashSet<Long?> = hashSetOf()
        set.add(hash)
        var pow: Long = 1
        for (i in 1 until size) pow *= 31
        val n = s.length
        for (i in size until n) {
            hash = nextHash(size, pow, hash, s[i - size], s[i])
            if (!set.add(hash)) {
                return s.substring(i - size + 1, i + 1)
            }
        }
        return null
    }

    private fun hash(s: String): Long {
        var h: Long = 0
        var a: Long = 1
        val n = s.length
        for (k in n downTo 1) {
            val ch = s[k - 1]
            h += (ch - 'a' + 1) * a
            a *= 31
        }
        return h
    }

    private fun nextHash(k: Int, pow: Long, hash: Long, left: Char, right: Char): Long =
        (hash - (left - 'a' + 1) * pow) * 31 + (right - 'a' + 1)
}
