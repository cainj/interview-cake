package leetcode.contest

import kotlin.math.pow

class BinaryCodes {

    fun hasAllCodes(s: String, k: Int): Boolean {
        val hash = hashSetOf<String>()

        for (i in 0 until (s.length - k + 1))
            hash.add(s.substring(i, i + k))

        return hash.size.toDouble() == 2.0.pow(k.toDouble())
    }
}
