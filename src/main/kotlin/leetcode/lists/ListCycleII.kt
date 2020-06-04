package leetcode.lists

class ListCycleII {

    fun detectCycle(head: ListNode?): ListNode? {
        var fast = head
        var slow = head

        while (fast != null) {
            slow = slow?.next
            fast = fast.next?.next

            if (slow == fast) break
        }

        if (fast == null) return null

        fast = head

        while (fast != null) {
            if (fast == slow) break
            fast = fast.next
            slow = slow?.next
        }

        return fast
    }
}
