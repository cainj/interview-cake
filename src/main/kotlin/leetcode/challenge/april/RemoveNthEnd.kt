package leetcode.challenge.april

import leetcode.ListNode

class RemoveNthEnd {

    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        val dummy = ListNode(-1)
        dummy.next = head
        var follower = dummy
        var leader = head
        var count = 0

        while (leader != null) {
            if (count >= n)
                follower = follower.next!!
            leader = leader.next
            count++
        }

        follower.next = follower.next?.next

        if (follower == dummy) return head?.next
        return head
    }
}
