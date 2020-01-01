package hackerrank.algorithms.strings

// Complete the pangrams function below.
fun pangrams(s: String): String {
    val alphaTable = Array(26) { 0 }
    for (c in s.toLowerCase())
        if (c != ' ')
            alphaTable[c - 'a'] = 1
    return if (alphaTable.all { it == 1 })
        "pangram"
    else
        "not pangram"
}

fun main() {
    val s = readLine()!!
    val result = pangrams(s)

    println(result)
}
