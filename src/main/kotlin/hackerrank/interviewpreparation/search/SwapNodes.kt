package hackerrank.interviewpreparation.search

import java.util.*

fun swapNodes(indexes: Array<IntArray>, queries: Array<Int>) {
    val l = IntArray(indexes.size + 1)
    val r = IntArray(indexes.size + 1)
    val d = IntArray(indexes.size + 1)
    val ans = mutableListOf<Int>()

    for (i in indexes.indices) {
        l[i + 1] = indexes[i][0]
        r[i + 1] = indexes[i][1]
    }

    fun inOrder(cur: Int) {
        if (l[cur] > 0) inOrder(l[cur])
        print("$cur ")
        if (r[cur] > 0) inOrder(r[cur])
    }

    fun calcDepth(cur: Int, depth: Int) {
        d[cur] = depth;
        if (l[cur] > 0) calcDepth(l[cur], depth + 1)
        if (r[cur] > 0) calcDepth(r[cur], depth + 1)
    }

    fun swap(index: Int) {
        val hold = l[index]
        l[index] = r[index]
        r[index] = hold
    }

    calcDepth(1, 1)

    for (query in queries) {
        for (i in indexes.indices) {
            if (d[i] % query == 0) {
                swap(i)
            }
        }
        inOrder(1)
        print("\n")
    }

}


fun main() {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val indexes = Array(n) { IntArray(2) { 0 } }

    for (indexesRowItr in 0 until n) {
        indexes[indexesRowItr] = scan.nextLine().split(" ").map { it.trim().toInt() }.toIntArray()
    }

    val queriesCount = scan.nextLine().trim().toInt()
    val queries = Array<Int>(queriesCount) { 0 }
    for (queriesItr in 0 until queriesCount) {
        val queriesItem = scan.nextLine().trim().toInt()
        queries[queriesItr] = queriesItem
    }

    swapNodes(indexes, queries)
}

