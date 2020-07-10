package leetcode.strings

class LetterCaseCombinations {

    private var ans = mutableListOf<String>()
    fun letterCasePermutation(S: String): List<String> {
        val ans = mutableListOf(StringBuilder())
        for (c in S) {
            val n = ans.size
            if (c.isLetter()) {
                for (i in 0 until n) {
                    ans.add(StringBuilder(ans[i]))
                    ans[i].append(c.toLowerCase())
                    ans[n + i].append(c.toUpperCase())
                }
            } else {
                for (i in 0 until n)
                    ans[i].append(c)
            }
        }

        return ans.map { it.toString() }
    }
}
