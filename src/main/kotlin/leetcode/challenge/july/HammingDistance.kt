package leetcode.challenge.july

class HammingDistance {

    fun hammingDistance(x: Int, y: Int): Int {
        var ans = 0
        var i = x xor y
        while (i > 0) {
            if ((i and 1) == 1) ans++
            i = i shr 1
        }

        return ans
    }
}
