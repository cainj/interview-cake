package hackerrank.interviewpreparation.linkedlists

import java.util.*


// Complete the reverse function below.
fun reverse(head: DoublyLinkedListNode?): DoublyLinkedListNode? {
    if (head == null) return null
    var rover: DoublyLinkedListNode? = head

    while (head.next != null) {
        val hold = head.next
        head.next = hold?.next
        hold?.prev = null
        rover?.prev = hold
        hold?.next = rover
        rover = hold
    }

    return rover
}

fun main() {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val linkedListCount = scan.nextLine().trim().toInt()
        val linkedList = DoublyLinkedList()

        for (i in 0 until linkedListCount) {
            val item = scan.nextLine().trim().toInt()
            linkedList.insertNode(item)
        }

        val linkedListNode = reverse(linkedList.head)
        printDoublyLinkedList(linkedListNode, " ")
        println()
    }
}
