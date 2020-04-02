package leetcode.challenge

import org.junit.jupiter.api.Test

class SingleNumberTest {
    private val sn = SingleNumber()

    @Test
    fun singleNumber() {
        println(sn.singleNumberSort(intArrayOf(4, 1, 2, 1, 2, 4, 3, 3, 9, 9, 8)))
        println(sn.singleNumberSort(intArrayOf( 1)))
        println(sn.singleNumberSort(intArrayOf(4, 1, 2, 1, 2, 4, 3, 3, 9, 9, 8)))
    }
}