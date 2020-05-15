package leetcode.recursion


class KthGrammar {

    fun kthGrammar(N: Int, K: Int): Int {
        if (N == 0) return 0
        return (K.inv() and 1) xor kthGrammar(
            N - 1,
            (K + 1) / 2
        )
    }

}
