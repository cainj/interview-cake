package leetcode.challenge.april

import leetcode.ListNode

class MiddleNode {


    fun middleNode(head: ListNode?): ListNode? {
        var slow: ListNode? = head
        var fast: ListNode? = head

        while (fast?.next != null) {
            slow = slow?.next
            fast = fast.next?.next
        }
        return slow
    }

//    fun middleNode(head: ListNode?): ListNode? {
//        var count = 0
//        var currentNode = head
//        var nodes = Array<ListNode?>(100){null}
//
//        while(currentNode != null){
//            nodes[count] = currentNode
//            currentNode = currentNode.next
//            count++
//        }
//
//        val middle = (count / 2)
//
//        return nodes[middle]
//    }
}
