package leetcode

class WordBreak {

    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        val dictionary = wordDict.toSet()
        return helper(s, dictionary, hashMapOf())
    }

    private fun helper(s: String, dictionary: Set<String>, memo: HashMap<String, Boolean>): Boolean {
        if (s.isEmpty()) return true

        if (memo.containsKey(s)) return memo[s]!!

        for (i in 1..s.length) {
            if (dictionary.contains(s.substring(0, i)) && helper(s.substring(i, s.length), dictionary, memo)) {
                memo[s.substring(i, s.length)] = true
                return true
            }
        }

        memo[s] = false
        return false
    }
}
