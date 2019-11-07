package hackerrank.interviewpreparation.dictionaries

import java.util.*

// Complete the sherlockAndAnagrams function below.
fun sherlockAndAnagrams(s: String): Int {
    var anagrams = 0
    val anagramKeys = hashMapOf<String, Int>()

    //create map
    for (i in s.indices) {
        for (j in i + 1..s.length) {
            val chars = s.substring(i, j).toCharArray()
            chars.sort()
            val key = String(chars)
            if (anagramKeys.containsKey(key)) {
                val oldValue = anagramKeys[key]!!
                anagrams += oldValue
                anagramKeys[key] = oldValue + 1
            } else
                anagramKeys[key] = 1
        }
    }
    return anagrams
}

fun main() {
    val scan = Scanner(System.`in`)
    val q = scan.nextLine().trim().toInt()
    for (qItr in 1..q) {
        val s = scan.nextLine()
        val result = sherlockAndAnagrams(s)

        println(result)
    }
}
