package leetcode.binarytrees

class UniqueBinarySearchTreeII {

    fun generateTrees(n: Int): List<TreeNode?> =
        if (n == 0) emptyList()
        else buildTree(1, n)

    private fun buildTree(start: Int, end: Int): List<TreeNode?> {
        val trees = mutableListOf<TreeNode?>()

        if (start > end) {
            trees.add(null)
            return trees
        }

        for (i in start..end) {
            val left = buildTree(start, i - 1)
            val right = buildTree(i + 1, end)
            for (l in left) {
                for (r in right) {
                    val root = TreeNode(i)
                    root.left = l
                    root.right = r
                    trees.add(root)
                }
            }
        }

        return trees
    }
}
