package interviewio

// To execute Kotlin code, please define a top level function named main

/**
     A <- remove
   /   \
  B     C <- remove
 / \   / \
D   E  F  G
 */


fun main() {
    val tree = TreeNode('A', TreeNode('C', TreeNode('G'), TreeNode('F')),
        TreeNode('B', TreeNode('E'), TreeNode('D')))
    println(deleteNodes(tree))
}


data class TreeNode(val data: Char, val right: TreeNode? = null, val left: TreeNode? = null) {
    override fun toString() = data.toString()
}


fun deleteNodes(root: TreeNode?): List<TreeNode> {
    return deleteHelper(root, null, mutableListOf())
}

@Suppress("ComplexCondition")
fun deleteHelper(currentNode: TreeNode?, parentNode: TreeNode?, accum: MutableList<TreeNode>): List<TreeNode> {

    if ((parentNode != null && shouldDelete(parentNode)) && (currentNode != null && !shouldDelete(currentNode))) {
        accum.add(currentNode)
    }

    if (currentNode?.right != null)
        deleteHelper(currentNode.right, currentNode, accum)

    if (currentNode?.left != null)
        deleteHelper(currentNode.left, currentNode, accum)

    return accum
}

fun shouldDelete(node: TreeNode): Boolean = node.data == 'A' || node.data == 'C'
