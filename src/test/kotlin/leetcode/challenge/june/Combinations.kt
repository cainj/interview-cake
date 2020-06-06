package leetcode.challenge.june

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
