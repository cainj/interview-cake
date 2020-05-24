package leetcode.contest

import kotlin.math.max

class Vowels {

    //Space Complexity is O(1)
    //Runtime is O(n)
    fun maxVowels(s: String, k: Int): Int {
        var end = 0
        var i = 0
        val vowels = hashSetOf<Char>('a', 'e', 'i', 'o', 'u')
        var max = 0
        var count = 0

        while (end < s.length) {
            //println(s[end])
            if (end > k - 1) {
                if (vowels.contains(s[i])) count--
                i++
            }

            if (vowels.contains(s[end])) count++
            max = max(max, count)
            end++
        }

        return max
    }
}
