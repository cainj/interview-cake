package leetcode

class BestSellStock {

    fun maxProfit(prices: IntArray): Int {
        if (prices.size < 2) return 0
        var A = 0
        var B = -prices[0]
        var C = 0

        for (i in 1 until prices.size) {
            val tmp = A
            A = Math.max(A, C)
            C = B + prices[i]
            B = Math.max(B, tmp - prices[i])
        }

        return Math.max(A, C)
    }
}
