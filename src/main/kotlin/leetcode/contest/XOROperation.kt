package leetcode.contest

class XOROperation {

    fun xorOperation(n: Int, start: Int): Int {
        val nums = IntArray(n)
        for (i in nums.indices) nums[i] = start + (2 * i)

        var bitwise = 0

        for (num in nums) bitwise = bitwise.xor(num)

        return bitwise
    }
}
