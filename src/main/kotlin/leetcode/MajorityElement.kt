package leetcode

class MajorityElement {

    fun majorityElement(nums: IntArray): Int {
        var count = 0
        var candidate = -1
        for (num in nums) {
            if (count == 0) candidate = num

            if (candidate != num) count--
            else count++
        }

        return candidate
    }
}
