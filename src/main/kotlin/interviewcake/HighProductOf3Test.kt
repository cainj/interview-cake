package interviewcake

import kotlin.math.max


fun highestProductOf3(nums: IntArray): Int {

    require(nums.size > 2)

    var max = Int.MIN_VALUE
    var secondMax = Int.MIN_VALUE
    var thirdMax = Int.MIN_VALUE
    var min = Int.MAX_VALUE
    var secondMin = Int.MAX_VALUE

    for (i in nums.indices) {
        if( nums[i] < min){
            secondMin = min
            min = nums[i]
        } else if(nums[i] < secondMin){
            secondMin = nums[i]
        }

        when {
            nums[i] > max -> {
                thirdMax = secondMax
                secondMax = max
                max = nums[i]
            }
            nums[i] in (secondMax + 1) until max -> {
                thirdMax = secondMax
                secondMax = nums[i]
            }
            nums[i] > thirdMax -> thirdMax = nums[i]
        }
    }

    return max(max * secondMax * thirdMax, min * secondMin * max)
}


fun highestProductOf3Sort(nums: IntArray): Int {
    //you can sort the array then take the top 3 largest number
    nums.sort()

    val first = nums[0]
    val second = nums[1]
    val third = nums[nums.size - 1]



    return if(first < 0 && second < 0)
        max(first * second * third, nums[nums.size - 3] * nums[nums.size - 2] * nums[nums.size - 1])
    else
        nums[nums.size - 3] * nums[nums.size - 2] * nums[nums.size - 1]
}
