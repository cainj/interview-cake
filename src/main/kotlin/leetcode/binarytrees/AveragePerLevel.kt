package leetcode.binarytrees

class AveragePerLevel {

    @ExperimentalStdlibApi
    fun averageOfLevels(tree: TreeNode?): DoubleArray {
        val root = tree ?: return doubleArrayOf()

        val height = height(tree)
        val deque = ArrayDeque<List<TreeNode>>()
        val ans = DoubleArray(height)
        deque.addFirst(listOf(root))

        for (i in 0 until height) {
            val nodes = deque.first()
            val children = mutableListOf<TreeNode>()
            var sum = 0.0

            for (node in nodes) {
                sum += node.`val`.toDouble()
                if (node.left != null) children.add(node.left!!)
                if (node.right != null) children.add(node.right!!)
            }

            ans[i] = (sum / nodes.size.toDouble())
            deque.addFirst(children)
        }

        return ans
    }

    private fun height(node: TreeNode?): Int {
        if (node == null) return 0

        return Math.max(height(node.left), height(node.right)) + 1

    }
}
