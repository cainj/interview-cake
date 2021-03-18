package leetcode.binarytrees

class LonelyNodes {

    private var lonelyNodes = mutableListOf<Int>()

    fun getLonelyNodes(root: TreeNode?): List<Int> {
        lonelyNodes = mutableListOf()
        lonelyNode(root)
        return lonelyNodes
    }

    private fun lonelyNode(node: TreeNode?) {
        if (node == null) return

        if (node.left == null && node.right != null) lonelyNodes.add(node.right!!.`val`)
        else if (node.right == null && node.left != null) lonelyNodes.add(node.left!!.`val`)

        lonelyNode(node.left)
        lonelyNode(node.right)
    }
}
