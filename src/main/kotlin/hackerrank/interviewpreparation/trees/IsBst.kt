package hackerrank.interviewpreparation.trees


fun checkBst(treeNode: TreeNode): Boolean {
    // traverse left and make sure the parent node is greater than left child
    // traverse right and make sure the parent node is less than right child
    // if it passes these conditions it's a BST else it's not

    return doCheckBst(
        treeNode.left,
        Int.MIN_VALUE,
        treeNode.data
    ) && doCheckBst(
        treeNode.right,
        treeNode.data,
        Int.MAX_VALUE
    )
}

fun doCheckBst(treeNode: TreeNode?, lowerBounds: Int, upperBounds: Int): Boolean {
    return when {
        treeNode == null -> return true
        treeNode.data in lowerBounds..upperBounds -> doCheckBst(
            treeNode.left,
            lowerBounds,
            treeNode.data
        ) && doCheckBst(
            treeNode.right,
            treeNode.data,
            upperBounds
        )
        else -> return false
    }
}


fun main() {

    val rightTree = TreeNode(7)
    rightTree.insert(6)
    rightTree.insert(9)

    val leftTree = TreeNode(3)
    leftTree.insert(2)
    leftTree.insert(4)
    val rootNode = TreeNode(5, leftTree, rightTree)

    println(checkBst(rootNode))
    //rootNode.printInOrder()
}
