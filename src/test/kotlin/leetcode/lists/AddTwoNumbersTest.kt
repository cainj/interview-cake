package leetcode.lists

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class AddTwoNumbersTest {

    @Test
    fun addTwoNumbers() {
        val twoNumbers = AddTwoNumbers()
        assertEquals(ListNode(8, ListNode(1)), twoNumbers.addTwoNumbers(ListNode(9), ListNode(9)))
        assertEquals(
            ListNode(8, ListNode(9, ListNode(1))),
            twoNumbers.addTwoNumbers(ListNode(9, ListNode(9)), ListNode(9, ListNode(9)))
        )
    }
}
