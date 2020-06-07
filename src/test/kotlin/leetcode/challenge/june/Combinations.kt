package leetcode.challenge.june

/**
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 * Input: n = 4, k = 2
 * Output:
 * [
 *      [2,4],
 *      [3,4],
 *      [2,3],
 *      [1,2],
 *      [1,3],
 *      [1,4],
 * ]
 */
class Combinations {

    private val combinations = MutableList(0) { MutableList<Int>(0) { 0 } }

    fun combine(n: Int, k: Int): List<List<Int>> {
        solve(n, k, 1)
        return combinations
    }


    private fun solve(n: Int, k: Int, first: Int, combo: MutableList<Int> = mutableListOf()) {
        if (k == combo.size) {
            val c = mutableListOf<Int>()
            c.addAll(combo)
            combinations.add(c)
        }

        for (choice in first..n) {
            combo.add(choice)
            solve(n, k, choice + 1, combo)
            combo.removeAt(combo.size - 1)
        }
    }
}
