package hacker_rank.interview_preparation.strings

import java.util.*

// Complete the makeAnagram function below.
fun makeAnagram(a: String, b: String): Int {
    val rover = IntArray(26) { 0 }
    var removeCount = 0
    for (c in a) {
        rover[c.toInt() - 97] += 1
    }

    for (c in b) {
        rover[c.toInt() - 97] -= 1
    }

    for (i in rover.indices)
        removeCount +=
            if (rover[i] < 0)
                (rover[i] * -1)
            else
                rover[i]
    return removeCount
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val a = scan.nextLine()

    val b = scan.nextLine()

    val res = makeAnagram(a, b)

    println(res)
}