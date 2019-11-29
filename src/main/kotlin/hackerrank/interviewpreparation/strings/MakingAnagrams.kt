package hackerrank.interviewpreparation.strings

import java.util.*

// Complete the makeAnagram function below.
fun makeAnagram(a: String, b: String): Int {
    val rover = IntArray(26) { 0 }
    var removeCount = 0
    for (c in a) {
        rover[c.toInt() - 'a'.toInt()] += 1
    }

    for (c in b)
        rover[c.toInt() - 'a'.toInt()] -= 1

    for (i in rover.indices)
        removeCount +=
            if (rover[i] < 0)
                (rover[i] * -1)
            else
                rover[i]
    return removeCount
}

fun main() {
    val scan = Scanner(System.`in`)
    val a = scan.nextLine()
    val b = scan.nextLine()
    val res = makeAnagram(a, b)

    println(res)
}
