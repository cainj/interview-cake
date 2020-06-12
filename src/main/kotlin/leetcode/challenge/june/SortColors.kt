package leetcode.challenge.june

class SortColors {

    fun sortColors(nums: IntArray): Unit {
        var reds = 0
        var blues = nums.size - 1
        var i = 0

        while (i <= blues) {
            //println("$i:$blues")
            when {
                nums[i] == 2 -> {
                    val tmp = nums[i]
                    nums[i] = nums[blues]
                    nums[blues--] = tmp
                }
                nums[i] == 0 -> {
                    val tmp = nums[reds]
                    nums[reds++] = nums[i]
                    nums[i++] = tmp
                }
                else -> i++
            }
        }
    }
}
