package leetcode.challenge.april

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CountElementsTest {

    val countElements = CountElements()
    @Test
    fun happyNumberTest() {
        Assertions.assertEquals(countElements.countElements(intArrayOf(1, 1, 2, 2)), 2)
        Assertions.assertEquals(countElements.countElements(intArrayOf(1, 3, 2, 3, 5, 0)), 3)
        Assertions.assertEquals(countElements.countElements(intArrayOf(1, 1, 3, 3, 5, 5, 7, 7)), 0)
    }
}
