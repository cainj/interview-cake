import java.util.*

// Complete the palindromeIndex function below.
fun palindromeIndex(s: String): Int {
    val characters = s.toMutableList()
    for (i in s.indices)
        if (s[i] != s[s.length - 1 - i]) {
            characters.removeAt(i)
            for (j in characters.indices) {
                if (characters[j] != characters[characters.size - 1 - j])
                    return s.length - 1 - i
            }

            return i
        }

    return -1
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()
        val result = palindromeIndex(s)

        println(result)
    }
}
