package hackerrank.interviewpreparation.strings

import java.util.*

// Complete the alternatingCharacters function below.
fun alternatingCharacters(s: String): Int {
    var deletions = 0
    var marker = s[0]

    for (i in 1 until s.length) {
        if (marker == s[i])
            deletions++
        else {
            marker = s[i]
        }
    }

    return deletions
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()
        val result = alternatingCharacters(s)

        println(result)
    }
}
