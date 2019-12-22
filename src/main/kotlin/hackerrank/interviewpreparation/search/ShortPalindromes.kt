package hackerrank.interviewpreparation.search

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val s = scan.nextLine()
    val result = shortPalindrome(s)

    println(result)
}

const val MOD = 1000000007
const val SIZE = 26

// Complete the shortPalindrome function below.
fun shortPalindrome(s: String): Long {
    val single = Array(SIZE) { 0L }
    val double = Array(SIZE) { Array(SIZE) { 0L } }
    val triple = Array(SIZE) { Array(SIZE) { Array(SIZE) { 0L } } }
    val quadruple = Array(SIZE) { Array(SIZE) { Array(SIZE) { Array(SIZE) { 0L } } } }

    for (i in s) {
        val c = i - 'a'
        for (j in 0 until 26) {
            quadruple[c][j][j][c] += triple[c][j][j] % MOD
            triple[j][c][c] += double[j][c] % MOD
            double[j][c] += single[j] % MOD
        }
        single[c]++
    }

    return Arrays.stream(quadruple)
        .flatMap(Arrays::stream)
        .flatMap(Arrays::stream)
        .flatMapToLong { Arrays.stream(it.toLongArray()) }.sum() % MOD
}

// Complete the shortPalindrome function below.
fun shortPalindromeBrutForce(s: String): Int {
    var solution = 0

    for (i in 0..s.length - 3) {
        for (j in i + 3 until s.length)
            if (s[i] == s[j])
                solution += findMiniPalindromes(s.substring(i + 1, j))


    }

    return solution
}


fun findMiniPalindromes(substring: String): Int {
    var solution = 0
    for (m in 0 until substring.length - 1)
        for (n in m + 1 until substring.length)
            if (substring[m] == substring[n])
                solution++

    return solution
}

