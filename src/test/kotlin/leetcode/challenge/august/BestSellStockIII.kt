package leetcode.challenge.august

import kotlin.math.max

class BestSellStockIII {

    fun maxProfit(prices: IntArray): Int {
        if (prices.size < 2) return 0

        var pMin = prices[0]
        var profit = 0
        val profitsA = IntArray(prices.size)
        for (i in prices.indices) {
            val p = prices[i]
            if (pMin > p) pMin = p
            if (p - pMin > profit) profit = p - pMin
            profitsA[i] = profit
        }

        var pMax = prices[prices.size - 1]
        val profitsB = IntArray(prices.size)
        profit = 0
        for (i in prices.size - 1 downTo 0) {
            val p = prices[i]
            if (p > pMax) pMax = p
            if (pMax - p > profit) profit = pMax - p
            profitsB[i] = profit
        }

        var max = 0
        for (i in prices.indices)
            max = max(max, profitsB[i] + profitsA[i])

        return max
    }
}
