package leetcode.binarytrees

class ConnectRightPointersII {

    fun connect(root: Node?): Node? {
        if (root == null) return root

        var leftMost: Node? = root

        while (leftMost != null) {
            var prev: Node? = null
            var curr = leftMost
            leftMost = null

            while (curr != null) {
                if (curr.left != null) {
                    if (prev != null)
                        prev.next = curr.left
                    else
                        leftMost = curr.left

                    prev = curr.left
                }
                if (curr.right != null) {
                    if (prev != null)
                        prev.next = curr.right
                    else
                        leftMost = curr.right

                    prev = curr.right
                }

                curr = curr.next
            }
        }

        return root
    }
}
