package hacker_rank

import java.util.*


typealias Pos = Pair<Int, Int>

// Complete the minimumBribes function below.
fun minimumBribes(q: Array<Int>): Unit {
    var bribes = 0
    var expectedFirst = 1
    var expectedSecond = 2
    var expectedThird = 3
    for (i in q.indices) {
        when (q[i]) {
            expectedFirst -> {
                expectedFirst = expectedSecond
                expectedSecond = expectedThird
                ++expectedThird
            }
            expectedSecond -> {
                ++bribes
                expectedSecond = expectedThird
                ++expectedThird
            }
            expectedThird -> {
                bribes += 2;
                ++expectedThird;
            }
            else -> return println("Too chaotic")
        }
    }
    println(bribes)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val q = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

        minimumBribes(q)
    }
}
