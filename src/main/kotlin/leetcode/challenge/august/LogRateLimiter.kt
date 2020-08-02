package leetcode.challenge.august

import kotlin.math.abs

class LogRateLimiter {

    /** Initialize your data structure here. */
    private val hash = hashMapOf<String, Int>()

    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
    If this method returns false, the message will not be printed.
    The timestamp is in seconds granularity. */
    fun shouldPrintMessage(timestamp: Int, message: String): Boolean =
        when (hash[message]) {
            null -> {
                hash[message] = timestamp
                true
            }
            else -> {
                if (abs(timestamp - hash[message]!!) > 9) {
                    hash[message] = timestamp
                    true
                } else false
            }
        }
}
