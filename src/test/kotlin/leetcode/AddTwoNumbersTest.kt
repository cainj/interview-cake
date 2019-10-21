package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class AddTwoNumbersTest {

    @Test
    fun sampleTest() {
        /**
         * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
         * Output: 7 -> 0 -> 8
         * Explanation: 342 + 465 = 807.
         */
        val node1 = ListNode(2, ListNode(4, ListNode(3)))
        val node2 = ListNode(5, ListNode(6, ListNode(4)))
        val expected = ListNode(7, ListNode(0, ListNode(8)))
        val actual = addTwoNumbers(node1, node2)
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sampleTest2() {
        /**
         * Input: (9 -> 9 -> 9) + (9 -> 9 -> 9)
         * Output: 9 -> 9 -> 19
         * Explanation: 999 + 999 = 1998.
         */
        val node1 = ListNode(9, ListNode(9, ListNode(9)))
        val node2 = ListNode(9, ListNode(9, ListNode(9)))
        val expected = ListNode(8, ListNode(9, ListNode(9, ListNode(1))))
        val actual = addTwoNumbers(node1, node2)
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sampleTest3() {
        /**
         * Input: (9 -> 9 -> 9) + (9 -> 9 -> 9)
         * Output: 9 -> 9 -> 19
         * Explanation: 999 + 999 = 1998.
         */
        val node1 = ListNode(5)
        val node2 = ListNode(5)
        val expected = ListNode(0, ListNode(1))
        val actual = addTwoNumbers(node1, node2)
        Assertions.assertEquals(expected, actual)
    }
}