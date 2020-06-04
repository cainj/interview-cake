package leetcode.challenge.april

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BackSpaceCompareTest {

    @Test
    fun backspaceCompareTest() {
        val s = BackspaceCompare()
        Assertions.assertEquals(false, s.backspaceCompare("bxj##tw", "bxj###tw"))
        Assertions.assertEquals(true, s.backspaceCompare("ab#c", "ad#c"))
        Assertions.assertEquals(true, s.backspaceCompare("bxj##tw", "bxj#s##tw"))
    }
}
