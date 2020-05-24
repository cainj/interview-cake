package leetcode.strings

import java.math.BigInteger

class AddBinary {

    fun addBinary(a: String, b: String): String? {
        var x = BigInteger(a, 2)
        var y = BigInteger(b, 2)
        val zero = BigInteger("0", 2)
        var carry: BigInteger
        var answer: BigInteger

        while (y.compareTo(zero) != 0) {
            answer = x.xor(y)
            carry = x.and(y).shiftLeft(1)
            x = answer
            y = carry
        }

        return x.toString(2)
    }
}
