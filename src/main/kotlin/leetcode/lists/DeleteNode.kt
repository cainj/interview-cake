package leetcode.lists

/**
 * Note:
 * The linked list will have at least two elements.
 * All of the nodes' values will be unique.
 * The given node will not be the tail and it will always be a valid node of the linked list.
 * Do not return anything from your function.
 */
class DeleteNode {
    fun deleteNode(node: ListNode?) {
        node?.`val` = node?.next!!.`val`
        node.next = node.next?.next
    }
}
