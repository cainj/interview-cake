package leetcode.challenge.july

class ReverseBits {
    // you need treat n as an unsigned value
    fun reverseBits(n: Int): Int {
        var result = n.toLong()
        result = ((result and 0xffff0000) shr 16) or ((result and 0x0000ffff) shl 16)
        result = ((result and 0xff00ff00) shr 8) or ((result and 0x00ff00ff) shl 8)
        result = ((result and 0xf0f0f0f0) shr 4) or ((result and 0x0f0f0f0f) shl 4)
        result = ((result and 0xcccccccc) shr 2) or ((result and 0x33333333) shl 2)
        result = ((result and 0xaaaaaaaa) shr 1) or ((result and 0x55555555) shl 1)

        return result.toInt()
    }
}
