package leetcode.binarytrees

class BinaryTreePreorder {

    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? =
        treeBuilder(preorder, inorder, 0, 0, preorder.size - 1)

    private fun treeBuilder(
        preorder: IntArray,
        inorder: IntArray,
        preStart: Int,
        startIndex: Int,
        endIndex: Int
    ): TreeNode? {
        if (preStart > preorder.size - 1 || startIndex > endIndex) return null

        val node = TreeNode(preorder[preStart])
        val pIndex = search(inorder, startIndex, endIndex, node.`val`)

        node.left = treeBuilder(preorder, inorder, preStart + 1, startIndex, pIndex - 1)
        node.right = treeBuilder(preorder, inorder, preStart + pIndex - startIndex + 1, pIndex + 1, endIndex)

        return node
    }

    private fun search(inorder: IntArray, start: Int, end: Int, value: Int): Int {
        for (i in start..end)
            if (inorder[i] == value) {
                return i
            }

        return start
    }
}


/*

    3
   / \
  9  20
    /  \
   15   7

preorder = [3,9,20,15,7]
inorder = [9,3,15,20,7]

in the inroder array rootIndex = 1
*/
