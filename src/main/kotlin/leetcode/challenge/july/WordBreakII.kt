package leetcode.challenge.july

class WordBreakII {

    private val memo = hashMapOf<String, List<String>>()

    fun wordBreak(s: String, wordDict: List<String>): List<String> {
        if (memo.contains(s)) return memo[s]!!

        val result = mutableListOf<String>()

        for (w in wordDict) {
            if (s.startsWith(w)) {
                if (w.length == s.length) result.add(w)
                else {
                    val tmp = wordBreak(s.substring(w.length), wordDict)
                    for (t in tmp) result.add(0, "$w $t")
                }
            }
        }

        memo[s] = result

        return result
    }
}
