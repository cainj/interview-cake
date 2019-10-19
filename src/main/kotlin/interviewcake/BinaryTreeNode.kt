package interviewcake

data class NodeDepthPair(val node: BinaryTreeNode, val depth: Int)

class BinaryTreeNode(val value: Int, var left: BinaryTreeNode? = null, var right: BinaryTreeNode? = null) {

    fun insertLeft(leftValue: Int): BinaryTreeNode {
        this.left = BinaryTreeNode(leftValue)
        return this.left!!
    }

    fun insertRight(rightValue: Int): BinaryTreeNode {
        this.right = BinaryTreeNode(rightValue)
        return this.right!!
    }
}