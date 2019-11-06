package hackerrank.interviewpreparation.dictionaries

import java.util.*

// Complete the sherlockAndAnagrams function below.
fun sherlockAndAnagrams(s: String): Int {


}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val q = scan.nextLine().trim().toInt()
    for (qItr in 1..q) {
        val s = scan.nextLine()
        val result = sherlockAndAnagrams(s)

        println(result)
    }
}
