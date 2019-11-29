package hackerrank.interviewpreparation.dictionaries

import java.util.*

// Complete the checkMagazine function below.
fun checkMagazine(magazine: Array<String>, note: Array<String>) {
    val hashMap = mutableMapOf<String, Int>()
    for (word in magazine) {
        if (hashMap[word] == null)
            hashMap[word] = 1
        else
            hashMap[word] = hashMap[word]!! + 1
    }
    for (word in note) {
        val x = hashMap.getOrDefault(word, 0)
        if (x != 0) {
            hashMap[word] = x - 1
        } else
            return println("No")
    }
    println("Yes")
}

fun main() {
    val scan = Scanner(System.`in`)
    val magazine = scan.nextLine().split(" ").toTypedArray()
    val note = scan.nextLine().split(" ").toTypedArray()

    checkMagazine(magazine, note)
}
