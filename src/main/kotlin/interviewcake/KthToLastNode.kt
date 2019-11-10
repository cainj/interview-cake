package interviewcake

fun kthToLastNode(kth: Int, head: LinkedListNode?): LinkedListNode? {

    requireNotNull(head)
    require(kth > 0)

    var floor = 1
    var tracker = head
    var currentNode = head

    while (currentNode!!.next != null) {
        if (floor >= kth)
            tracker = tracker!!.next

        currentNode = currentNode.next
        floor++
    }

    return if (floor >= kth) tracker else throw Exception("List is not large enough to have kth:$kth element")
}
