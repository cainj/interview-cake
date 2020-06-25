package leetcode.challenge.june

class UniqueBST {

    //n = 1 k = 1, n = 2  k = 3, n = 3  k = 5, n = 4 k = 14
    fun numTrees(n: Int): Int {
        val rover = IntArray(n + 1)
        rover[0] = 1
        rover[1] = 1

        for (i in 2..n)
            for (j in 0 until i)
                rover[i] += rover[j] * rover[i - j - 1]

        return rover[n]
    }
}
