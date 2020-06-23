package leetcode.challenge.june

class SingleNumberII {

//    fun singleNumber(nums: IntArray): Int {
//        nums.sort()
//
//        for(i in 0 until nums.size step 3){
//            var j = i + 2
//            if(j > nums.size) break
//            if(nums[i] != nums[j]) return nums[i]
//        }
//
//        return nums[nums.size - 1]
//
//    }

    fun singleNumber(nums: IntArray): Int {
        var seenOnce = 0
        var seenTwice = 0
        for (num in nums) {
            // first appearence:
            // add num to seen_once
            // don't add to seen_twice because of presence in seen_once

            // second appearance:
            // remove num from seen_once
            // add num to seen_twice

            // third appearance:
            // don't add to seen_once because of presence in seen_twice
            // remove num from seen_twice
            seenOnce = seenTwice.inv() and (seenOnce xor num)
            seenTwice = seenOnce.inv() and (seenTwice xor num)
        }
        return seenOnce
    }
}
