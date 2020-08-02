package leetcode.contest

import kotlin.math.abs

class GoodTriplets {

    fun countGoodTriplets(arr: IntArray, a: Int, b: Int, c: Int): Int {
        var count = 0

        for (i in arr.indices)
            for (j in i + 1 until arr.size)
                for (k in j + 1 until arr.size) {
                    if (abs(arr[i] - arr[j]) <= a && abs(arr[j] - arr[k]) <= b && abs(arr[i] - arr[k]) <= c) {
                        count++
                    }
                }

        return count
    }
}
