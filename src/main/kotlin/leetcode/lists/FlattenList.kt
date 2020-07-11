package leetcode.lists

class Node(
    var `val`: Int,
    var prev: Node? = null,
    var next: Node? = null,
    var child: Node? = null
) {
    override fun equals(other: Any?): Boolean {
        if (other !is Node) return false

        return (other.`val` == this.`val`
                && other.next?.`val` == this.next?.`val`
                && other.prev?.`val` == this.prev?.`val`
                && other.child?.`val` == this.child?.`val`)
    }
}

class FlattenList {

    fun flatten(root: Node?): Node? {
        val head = root ?: return null

        val dummy = Node(0, next = head)

        flattenDFS(dummy, head)
        dummy.next?.prev = null

        return dummy.next
    }

    private fun flattenDFS(prev: Node?, curr: Node?): Node? {
        if (curr == null) return prev
        curr.prev = prev
        prev?.next = curr

        // the curr.next would be tempered in the recursive function
        val tempNext = curr.next

        val tail = flattenDFS(curr, curr.child)
        curr.child = null

        return flattenDFS(tail, tempNext)
    }
}
