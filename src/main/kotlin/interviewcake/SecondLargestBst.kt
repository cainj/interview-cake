package interviewcake


@Throws(Exception::class)
fun findSecondLargest(rootNode: BinaryTreeNode?): Int {
    if (rootNode == null || (rootNode.left == null
                && rootNode.right == null)
    ) throw Exception("Root node must have at least one child")

    return doSecondLargestIteratively(rootNode)
}

private fun doSecondLargestIteratively(rootNode: BinaryTreeNode): Int {

    var current: BinaryTreeNode? = rootNode

    while (true) {

        when {
            current?.left != null && current.right == null ->
                return findLargest(current.left!!)
            current?.right != null
                    && current.right?.left == null
                    && current.right?.right == null -> return current.value
            else -> current = current!!.right
        }
    }


}

private fun findLargest(rootNode: BinaryTreeNode): Int {
    var current: BinaryTreeNode? = rootNode
    while (current!!.right != null) {
        current = current.right
    }
    return current.value
}

private fun findLargestRecursively(node: BinaryTreeNode): Int {
    if (node.right != null)
        return findLargestRecursively(node.right!!)

    return node.value

}

@Throws(Exception::class)
fun findSecondLargestRecursive(rootNode: BinaryTreeNode?): Int {
    if (rootNode == null || (rootNode.left == null
                && rootNode.right == null)
    ) throw Exception("Root node must have at least one child")

    return when {
        rootNode.left != null && rootNode.right == null -> findLargestRecursively(rootNode.left!!)
        rootNode.right != null
                && rootNode.right?.left == null
                && rootNode.right?.right == null -> rootNode.value
        else -> findSecondLargest(rootNode.right)
    }
}