package interviewcake

import kotlin.math.max
import kotlin.math.min

fun getMaxProfitQuadratic(stockPrices: IntArray): Int {
    if (stockPrices.size < 2) throw Exception()
    var max = Integer.MIN_VALUE
    var buy = 0
    var sell = 0
    for (i in 0..stockPrices.size - 2) {
        for (j in i + 1 until stockPrices.size) {
            if (stockPrices[j] - stockPrices[i] > max) {
                buy = stockPrices[i]
                sell = stockPrices[j]
                max = sell - buy
            }
        }
    }
    return sell - buy
}

fun getMaxProfit(stockPrices: IntArray): Int {
    if (stockPrices.size < 2) throw Exception()
    var bestBuy = stockPrices[0]
    var maxProfit = stockPrices[1] - stockPrices[0]
    for (i in stockPrices.indices) {
        maxProfit = max(stockPrices[i] - bestBuy, maxProfit)
        bestBuy = min(bestBuy, stockPrices[i])
    }
    return maxProfit
}