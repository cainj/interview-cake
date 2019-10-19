package interviewcake

fun deleteNode(node: LinkedListNode?) {

    // delete the input node from the linked list
    //to the given node replace the
    //value with it's next value
    //then override the next value with it's next, next value

    if (node?.next != null) {
        node.value = node.next!!.value
        node.next = node.next!!.next
    } else
        throw Exception()
}
