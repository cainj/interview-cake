package leetcode.hashtable

class ContainsDuplicates {

    fun containsDuplicate(nums: IntArray): Boolean {
        val dups = hashSetOf<Int>()
        for (n in nums) {
            if (dups.contains(n)) return true
            dups.add(n)
        }

        return false
    }
}
