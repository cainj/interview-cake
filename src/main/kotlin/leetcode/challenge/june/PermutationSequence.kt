package leetcode.challenge.june

class PermutationSequence {
    private var count = 0
    fun getPermutation(n: Int, k: Int): String {
        count = 0
        return backtrack(StringBuilder(), n, k, BooleanArray(n + 1), mutableListOf())[0]
    }

    private fun backtrack(
        sb: StringBuilder,
        n: Int,
        k: Int,
        seen: BooleanArray,
        ans: MutableList<String>
    ): List<String> {
        if (sb.length == n) {
            count++
            return if (count == k) {
                ans.add(sb.toString())
                ans
            } else ans
        }

        val size = sb.length
        for (i in 1..n)
            if (!seen[i]) {
                seen[i] = true
                sb.append(i)
                backtrack(sb, n, k, seen, ans)
                sb.setLength(size)
                seen[i] = false
            }

        return ans
    }
}
