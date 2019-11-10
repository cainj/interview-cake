package hackerrank.interviewpreparation.search

import java.util.*

// Complete the triplets function below.
fun triplets(a: IntArray, b: IntArray, c: IntArray): Long {
    val arra = a.sorted().distinct()
    val arrb = b.sorted().distinct()
    val arrc = c.sorted().distinct()

    var count = 0L
    var ai = 0
    var ci = 0
    for (i in arrb.indices) {
        while (ai < arra.size && arrb[i] >= arra[ai])
            ai++
        while (ci < arrc.size && arrb[i] >= arrc[ci])
            ci++
        count += ai.toLong() * ci.toLong()
    }

    return count
}

fun main() {
    val scan = Scanner(System.`in`)
    val lenaLenbLenc = scan.nextLine().split(" ")
    lenaLenbLenc[0].trim().toInt()
    lenaLenbLenc[1].trim().toInt()
    lenaLenbLenc[2].trim().toInt()

    val arra = scan.nextLine().split(" ").map { it.trim().toInt() }.toIntArray()
    val arrb = scan.nextLine().split(" ").map { it.trim().toInt() }.toIntArray()
    val arrc = scan.nextLine().split(" ").map { it.trim().toInt() }.toIntArray()
    val ans = triplets(arra, arrb, arrc)

    println(ans)
}
