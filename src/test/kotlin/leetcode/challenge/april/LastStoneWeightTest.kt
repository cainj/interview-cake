package leetcode.challenge.april

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LastStoneWeightTest {

    @Test
    fun lastStoneWeight(){
        val lsw = LastStoneWeight()
        Assertions.assertEquals(1, lsw.lastStoneWeight(intArrayOf(2,7,4,1,8,1)))
        Assertions.assertEquals(0, lsw.lastStoneWeight(intArrayOf(2,7,4,1,8,1,1)))
    }
}
