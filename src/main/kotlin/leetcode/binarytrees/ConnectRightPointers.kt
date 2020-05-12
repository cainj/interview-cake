package leetcode.binarytrees

data class Node(val value: Int, var left: Node? = null, var right: Node? = null, var next: Node? = null)

class ConnectRightPointers {

    fun connect(root: Node?): Node? {
        var parentNode = root

        while (parentNode?.left != null) {
            var head = parentNode
            while (head != null) {
                head.left?.next = head.right

                if (head.next != null)
                    head.right?.next = head.next?.left

                head = head.next
            }

            parentNode = parentNode.left
        }

        return root
    }
}
