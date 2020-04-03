package leetcode.challenge

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class HappyNumberTest {
    private val sn = HappyNumber()

    @Test
    fun happyNumberTest() {
        Assertions.assertEquals(sn.isHappy(19), true)
        Assertions.assertEquals(sn.isHappy(91), true)
        Assertions.assertEquals(sn.isHappy(70), true)
        Assertions.assertEquals(sn.isHappy(49), true)
        Assertions.assertEquals(sn.isHappy(31), true)
        Assertions.assertEquals(sn.isHappy(22), false)
        Assertions.assertEquals(sn.isHappy(123), false)
    }
}