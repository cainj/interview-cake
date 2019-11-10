package interviewcake

import java.util.*


class ChangePossibilities {

    private val memo = hashMapOf<String, Int>()

    fun changePossibilities(amount: Int, denominations: IntArray): Int =
        changePossibilitiesBottomUp(amount, denominations)

    private fun changePossibilitiesTopDown(left: Int, denominations: IntArray, currentIndex: Int): Int {
        var amountLeft = left

        // check our memo and short-circuit if we've already solved this one
        val memoKey = "$amountLeft, $currentIndex"
        if (memo.containsKey(memoKey)) {
            println("grabbing memo [$memoKey]")
            return memo[memoKey]!!.toInt()
        }

        // base cases:
        // we hit the amount spot on. yes!
        if (amountLeft == 0) return 1

        // we overshot the amount left (used too many coins)
        if (amountLeft < 0) return 0

        // we're out of denominations
        if (currentIndex == denominations.size) return 0

        System.out.printf(
            "checking ways to make %d with %s\n",
            amountLeft, Arrays.toString(
                Arrays.copyOfRange(
                    denominations,
                    currentIndex, denominations.size
                )
            )
        )

        // choose a current coin
        val currentCoin = denominations[currentIndex]

        // see how many possibilities we can get
        // for each number of times to use currentCoin
        var numPossibilities = 0
        while (amountLeft >= 0) {
            println("current coin: $currentCoin")
            numPossibilities += changePossibilitiesTopDown(
                amountLeft, denominations,
                currentIndex + 1
            )
            amountLeft -= currentCoin
        }

        // save the answer in our memo so we don't compute it again
        memo[memoKey] = numPossibilities
        return numPossibilities
    }
}

fun changePossibilitiesBottomUp(amount: Int, denominations: IntArray): Int {

    val waysOfDoingNCents = IntArray(amount + 1)  // array of zeros from 0..amount
    waysOfDoingNCents[0] = 1

    for (coin in denominations) {
        for (higherAmount in coin..amount) {
            val higherAmountRemainder = higherAmount - coin
            waysOfDoingNCents[higherAmount] += waysOfDoingNCents[higherAmountRemainder]
        }
    }

    return waysOfDoingNCents[amount]
}
