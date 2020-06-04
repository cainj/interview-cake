package leetcode.challenge.april

class Stocks {


    fun maxProfit(prices: IntArray): Int {
        var maxprofit = 0
        for (i in 1 until prices.size) {
            if (prices[i] > prices[i - 1]) maxprofit += prices[i] - prices[i - 1]
        }
        return maxprofit
    }

//    fun maxProfit(prices: IntArray): Int {
//
//        var buy = false
//        var currentMax = prices[0]
//        var currentMin = prices[0]
//        var profit = 0
//
//        for (i in 1 until prices.size) {
//            if (!buy) {
//                if (currentMin >= prices[i])
//                    currentMin = prices[i]
//                else {
//                    buy = true
//                    currentMax = prices[i]
//                }
//            } else if (currentMax <= prices[i])
//                currentMax = prices[i]
//            else {
//                buy = false
//                profit += currentMax - currentMin
//                currentMin = prices[i]
//                currentMax = prices[i]
//
//            }
//        }
//
//        if (buy && currentMax > currentMin)
//            profit += currentMax - currentMin
//        return profit
//    }
}
