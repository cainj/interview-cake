package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class DeleteDuplicatesTest {

    @Test
    fun deleteDuplicates() {
        val dd = DeleteDuplicates()
        assertEquals(ListNode(1, ListNode(2)), dd.deleteDuplicates(ListNode(1, ListNode(1, ListNode(2)))))
    }
}
