package leetcode.challenge.june

class WordSearchII {
    private var ans = mutableListOf<String>()

    fun findWords(board: Array<CharArray>, words: Array<String>): List<String> {
        val root = TrieNode()
        ans =  mutableListOf<String>()
        for (word in words) {
            var node = root

            for (letter in word)
                node = if (node.children.containsKey(letter))
                    node.children[letter]!!
                else {
                    val newNode = TrieNode()
                    node.children[letter] = newNode
                    newNode
                }
            node.word = word
        }

        for (row in board.indices) {
            for (col in board[0].indices) {
                if (root.children.containsKey(board[row][col])) {
                    backtrack(row, col, board, root)
                }
            }
        }
        return ans
    }

    private fun backtrack(row: Int, col: Int, board: Array<CharArray>, parent: TrieNode) {
        val letter = board[row][col]
        val currNode = parent.children[letter]!!

        // check if there is any match
        if (currNode.word != null) {
            ans.add(currNode.word!!)
            currNode.word = null
        }

        board[row][col] = '#'

        for ((newRow, newCol) in neighbors(row to col, board))
            if (currNode.children.containsKey(board[newRow][newCol])) backtrack(newRow, newCol, board, currNode)


        board[row][col] = letter

        if (currNode.children.isEmpty()) parent.children.remove(letter)
    }

    private fun neighbors(pos: Pair<Int, Int>, board: Array<CharArray>): List<Pair<Int, Int>> {
        val directions = listOf(0 to 1, 0 to -1, 1 to 0, -1 to 0)
        val moves = mutableListOf<Pair<Int, Int>>()

        for (d in directions) {
            val row = pos.first + d.first
            val col = pos.second + d.second
            if (row >= 0 && col >= 0 && row < board.size && col < board[0].size) moves.add(row to col)
        }

        return moves
    }

    data class TrieNode(val children: HashMap<Char, TrieNode> = hashMapOf(), var word: String? = null)
}
