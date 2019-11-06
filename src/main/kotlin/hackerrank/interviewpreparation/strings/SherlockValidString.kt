package hackerrank.interviewpreparation.strings

import java.util.*

// Complete the isValid function below.
fun isValid(s: String): String {
    val frequencies = Array<Int>(26) { 0 }
    for (char in s)
        frequencies[char.toInt() - 'a'.toInt()] += 1
    var rover = 0
    var ticker = 0

    for (n in frequencies) {
        if (ticker > 1)
            return "NO"
        if (n != 0) {
            if (rover == 0)
                rover = n
            else if (rover - n != 0)
                ticker++
        }
    }

    return "YES"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val s = scan.nextLine()
    val result = isValid(s)

    println(result)
}