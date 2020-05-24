package leetcode.arrays

import kotlin.math.max

class BuySellStock {

    //Runtime complexity on the is O(n)
    //Space complexity is O(1)
    fun maxProfit(prices: IntArray): Int {
        if (prices.size < 2) return 0

        var sellIndex = 1
        var index = 0
        var max = 0

        while (sellIndex < prices.size) {
            if (prices[index] > prices[sellIndex])
                index = sellIndex
            max = max(max, prices[sellIndex] - prices[index])
            sellIndex++
        }

        return max
    }
}
