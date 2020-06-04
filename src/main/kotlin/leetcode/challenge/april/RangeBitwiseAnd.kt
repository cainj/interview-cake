package leetcode.challenge.april

class RangeBitwiseAnd {

    fun rangeBitwiseAnd(m: Int, n: Int): Int {
        var shiftM = m
        var shiftN = n
        var shift = 0

        while (shiftM != shiftN) {
            shiftM = shiftM shr 1
            shiftN = shiftN shr 1
            shift++
        }
        return shiftM shl shift
    }
}
