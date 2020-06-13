package leetcode.challenge.june

/**
 * You are given coins of different denominations and a total amount of money. Write a function to compute the number
 * of combinations that make up that amount. You may assume that you have infinite number of each kind of coin.
 *
 * Example 1:
 * Input: amount = 5, coins = [1, 2, 5]
 * Output: 4
 *
 * Explanation: there are four ways to make up the amount:
 * 5=5
 * 5=2+2+1
 * 5=2+1+1+1
 * 5=1+1+1+1+1
 *
 * Example 2:
 *
 * Input: amount = 3, coins = [2]
 * Output: 0
 * Explanation: the amount of 3 cannot be made up just with coins of 2.
 *
 * Example 3:
 * Input: amount = 10, coins = [10]
 * Output: 1
 */
class CoinChange2 {

    /**
     * Runtime is O(amount * coins)
     * Space complexity is O(amount * coins)
     */
    fun change(amount: Int, coins: IntArray): Int {

        val dp = Array(coins.size + 1) { IntArray(amount + 1) }
        dp[0][0] = 1
        coins.sort()

        for (i in coins.indices) {
            val coin = coins[i]
            for (j in dp[i + 1].indices) {
                if (j - coin < 0) dp[i + 1][j] = dp[i][j]
                else dp[i + 1][j] = dp[i][j] + dp[i + 1][j - coin]
            }
        }

        return dp[coins.size][amount]
    }
}
