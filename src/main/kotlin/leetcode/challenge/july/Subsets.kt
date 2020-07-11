package leetcode.challenge.july

class Subsets {

    fun subsets(nums: IntArray): List<List<Int>> {
        val ans = mutableListOf<ArrayList<Int>>()
        backtracking(0, nums, ArrayList<Int>(), ans)
        return ans
    }

    private fun backtracking(index: Int, nums: IntArray, combo: ArrayList<Int>, ans: MutableList<ArrayList<Int>>) {
        ans.add(ArrayList(combo))

        for (i in index until nums.size) {
            combo.add(nums[i])
            backtracking(i + 1, nums, combo, ans)
            combo.removeAt(combo.size - 1)
        }
    }
}
