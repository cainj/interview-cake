package hackerrank.algorithms.search

import java.util.*


fun knightlOnAChessboard(n: Int): Array<IntArray> {
    val size = n - 1
    val solution = Array(size) { IntArray(size) }
    for (i in 0 until size)
        for (j in 0 until size)
            if (solution[i][j] == 0) {
                solution[i][j] = move(n, i + 1, j + 1)
                solution[j][i] = solution[i][j]
            }

    return solution
}

fun move(n: Int, a: Int, b: Int): Int {
    val x = intArrayOf(b, a, b, a, -a, -b, -a, -b)
    val y = intArrayOf(a, b, -a, -b, b, a, -b, -a)
    val visit = Array(n) { IntArray(n) }
    val er = n - 1
    val ec = n - 1
    val q: Queue<IntArray> = LinkedList()
    q.add(intArrayOf(0, 0, 0))
    visit[0][0] = 1
    while (!q.isEmpty()) {
        val cur = q.remove()
        if (cur[0] == er && cur[1] == ec) {
            return cur[2]
        }
        for (i in 0..7) {
            val nr = x[i] + cur[0]
            val nc = y[i] + cur[1]
            if (nr in 0 until n && nc >= 0 && nc < n && visit[nr][nc] == 0) {
                q.add(intArrayOf(nr, nc, cur[2] + 1))
                visit[nr][nc] = 1
            }
        }
    }
    return -1
}

fun main() {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val result = knightlOnAChessboard(n)

    println(result.joinToString("\n") { it.joinToString(" ") })
}
